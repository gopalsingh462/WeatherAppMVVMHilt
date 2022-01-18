package com.example.weatherapp.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.data.remote.responses.WeatherResponse
import com.example.weatherapp.other.Event
import com.example.weatherapp.other.Resource
import com.example.weatherapp.repositories.WeatherRepository
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    private val weatherRepository: WeatherRepository
) : ViewModel() {
    private val _weatherData = MutableLiveData<Event<Resource<WeatherResponse>>>()
    val weatherData: LiveData<Event<Resource<WeatherResponse>>> = _weatherData

    fun getWeatherInfo(query: String) {
        if (query.isEmpty()) {
            return
        }
        _weatherData.value = Event(Resource.loading(null))
        viewModelScope.launch {
            val response = weatherRepository.getWeatherInfo(query)
            _weatherData.value = Event(response)
        }
    }
}