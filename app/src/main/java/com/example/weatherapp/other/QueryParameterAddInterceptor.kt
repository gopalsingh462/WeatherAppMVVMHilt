package com.example.weatherapp.other

import com.example.weatherapp.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class QueryParameterAddInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val url = chain.request().url().newBuilder()
            .addQueryParameter("appid", BuildConfig.OPENWEATHERMAP_API_KEY)
            .build()
        val request = chain.request().newBuilder()
            .url(url)
            .build()
        return chain.proceed(request)
    }
}