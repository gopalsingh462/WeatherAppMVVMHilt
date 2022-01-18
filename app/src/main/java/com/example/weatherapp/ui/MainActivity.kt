package com.example.weatherapp.ui

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.weatherapp.data.remote.responses.WeatherResponse
import com.example.weatherapp.databinding.ActivityMainBinding
import com.example.weatherapp.models.City
import com.example.weatherapp.other.*
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    var cityList: MutableList<City> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setCitySpinner()
        initViewModel()
        observeViewModel()
    }


    private fun initViewModel() {
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    private fun observeViewModel() {
        viewModel.weatherData.observe(this, { event ->
            val value = event.getContentIfNotHandled()
            value?.let { resource ->
                when (resource.status) {
                    Status.LOADING -> showProgress()
                    Status.ERROR -> hideProgressAndShowError(resource.message)
                    Status.SUCCESS -> bindDataToViews(resource.data!!)
                }
            }
        })
    }

    private fun showProgress() {
        binding.progressBar.show()
        binding.tvErrorMessage.hide()
    }

    private fun hideProgressAndShowContent() {
        binding.progressBar.hide()
        binding.tvErrorMessage.hide()
    }

    private fun hideProgressAndShowError(errorMessage: String?) {
        binding.progressBar.hide()
        binding.tvErrorMessage.show()
        binding.tvErrorMessage.text = errorMessage
    }

    private fun setCitySpinner() {
        val stream = this.assets.open("cities_list.json")
        val size = stream.available()
        val buffer = ByteArray(size)
        stream.read(buffer)
        stream.close()
        val tContents = String(buffer)
        val groupListType = object : TypeToken<ArrayList<City>>() {}.type
        val gson = GsonBuilder().create()
        cityList = gson.fromJson(tContents, groupListType)
        binding.layoutInput.spinner.adapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, cityList.map { it.name })
    }

    fun onBtnViewWeatherClick(view: View) {
        viewModel.getWeatherInfo(cityList[binding.layoutInput.spinner.selectedItemPosition].id.toString())
    }

    private fun bindDataToViews(weatherData: WeatherResponse) {
        hideProgressAndShowContent()
        binding.outputGroup.show()
        binding.layoutWeatherBasic.tvDateTime.text = weatherData.dt.unixTimestampToDateTimeString()
        binding.layoutWeatherBasic.tvTemperature.text =
            weatherData.main.temp.kelvinToCelsius().toString()
        binding.layoutWeatherBasic.tvCityCountry.text =
            "${weatherData.name}, ${weatherData.sys.country}"
        Glide.with(this).load("https://openweathermap.org/img/w/${weatherData.weather[0].icon}.png")
            .into(binding.layoutWeatherBasic.ivWeatherCondition)
        binding.layoutWeatherBasic.tvWeatherCondition.text = weatherData.weather[0].description
        binding.layoutWeatherAdditional.tvHumidityValue.text = "${weatherData.main.humidity}%"
        binding.layoutWeatherAdditional.tvPressureValue.text = "${weatherData.main.pressure} mBar"
        binding.layoutWeatherAdditional.tvVisibilityValue.text =
            "${weatherData.visibility / 1000.0} KM"

        binding.layoutSunsetSunrise.tvSunriseTime.text =
            weatherData.sys.sunrise.unixTimestampToTimeString()
        binding.layoutSunsetSunrise.tvSunsetTime.text =
            weatherData.sys.sunset.unixTimestampToTimeString()
    }
}