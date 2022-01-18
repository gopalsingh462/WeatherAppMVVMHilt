package com.example.weatherapp.repositories

import com.example.weatherapp.data.remote.responses.WeatherResponse
import com.example.weatherapp.other.Resource

interface WeatherRepository {
    suspend fun getWeatherInfo(query: String): Resource<WeatherResponse>
}