package com.example.weatherapp.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.weatherapp.MainCoroutineRule
import com.example.weatherapp.getOrAwaitValue
import com.example.weatherapp.other.Status
import com.example.weatherapp.repositories.FakeWeatherRepository
import com.example.weatherapp.repositories.WeatherRepository
import com.google.common.truth.Truth
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class MainViewModelTest {
    private lateinit var viewModel: MainViewModel
    private lateinit var weatherRepository: WeatherRepository

    //to access live data synchronous one by one
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    //to execute suspend functions in main thread
    @get:Rule
    var mainCoroutineRule: MainCoroutineRule = MainCoroutineRule()

    @Before
    fun setup() {
        weatherRepository = FakeWeatherRepository()
        viewModel = MainViewModel(weatherRepository)
    }

    /**
     * To check if MainViewModel is emitting success live data correctly or not
     */
    @Test
    fun `get weather info return success`() {
        viewModel.getWeatherInfo("123")
        val value = viewModel.weatherData.getOrAwaitValue()
        Truth.assertThat(value.getContentIfNotHandled()?.status).isEqualTo(Status.SUCCESS)
    }

    /**
     * To check if MainViewModel is emitting network error live data correctly or not
     */
    @Test
    fun `get weather info returns error`() {
        (weatherRepository as FakeWeatherRepository).setShouldReturnNetworkError(true)
        viewModel.getWeatherInfo("123")
        val value = viewModel.weatherData.getOrAwaitValue()
        Truth.assertThat(value.getContentIfNotHandled()?.status).isEqualTo(Status.ERROR)
    }

    /**
     * To check if MainViewModel is emitting loading live data correctly or not
     */
    @Test
    fun `get weather info returns loading`() {
        (weatherRepository as FakeWeatherRepository).setShouldReturnLoading(true)
        viewModel.getWeatherInfo("123")
        val value = viewModel.weatherData.getOrAwaitValue()
        Truth.assertThat(value.getContentIfNotHandled()?.status).isEqualTo(Status.LOADING)
    }

}