package com.example.weatherapp.data.remote

import com.example.weatherapp.data.remote.responses.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {
    @GET("/data/2.5/weather")
    suspend fun getWeatherInfo(
        @Query("id") query: String
    ): Response<WeatherResponse>
}