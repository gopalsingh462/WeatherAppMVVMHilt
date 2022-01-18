package com.example.weatherapp.repositories

import com.example.weatherapp.data.remote.responses.*
import com.example.weatherapp.other.Resource

class FakeWeatherRepository : WeatherRepository {
    private var shouldReturnNetworkError = false
    private var shouldReturnLoading = false

    fun setShouldReturnNetworkError(value: Boolean) {
        this.shouldReturnNetworkError = value
    }

    fun setShouldReturnLoading(value: Boolean) {
        this.shouldReturnLoading = value
    }

    override suspend fun getWeatherInfo(query: String): Resource<WeatherResponse> {
        return if (shouldReturnNetworkError) {
            Resource.error("Error message", null)
        } else if (shouldReturnLoading) {
            Resource.loading(null)
        } else {
            val weatherResponse = WeatherResponse(
                "stations",
                Clouds(10),
                0,
                Coord(51.5085, -0.1257),
                1642434264,
                2643743,
                Main(280.59, 74, 1038, 0.0, 282.76, 279.29),
                "London",
                Sys("GB", 2019646, 1642406263, 1642436577, 2),
                0,
                10000,
                listOf(),
                Wind(310, 5.14)
            )
            Resource.success(weatherResponse)
        }
    }
}