package com.example.weatherapp.repositories

import com.example.weatherapp.data.remote.WeatherAPI
import com.example.weatherapp.data.remote.responses.WeatherResponse
import com.example.weatherapp.other.Resource
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val weatherAPI: WeatherAPI
) : WeatherRepository {
    override suspend fun getWeatherInfo(query: String): Resource<WeatherResponse> {
        try {
            val response = weatherAPI.getWeatherInfo(query)
            if (response.isSuccessful) {
                response.body()?.let {
                    return Resource.success(it)
                } ?: return Resource.error("Unknown error occurred", null)
            } else {
                return Resource.error("Unknown error occured", null)
            }
        } catch (e: Exception) {
            return Resource.error("Please check your internet connection", null)
        }
    }

}