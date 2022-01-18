package com.example.weatherapp.di

import com.example.weatherapp.data.remote.WeatherAPI
import com.example.weatherapp.other.Constants
import com.example.weatherapp.other.QueryParameterAddInterceptor
import com.example.weatherapp.repositories.WeatherRepository
import com.example.weatherapp.repositories.WeatherRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRetrofit(client: OkHttpClient): Retrofit {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }

    @Singleton
    @Provides
    fun provideOKHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(QueryParameterAddInterceptor())
            .build()
    }

    @Singleton
    @Provides
    fun provideWeatherAPI(retrofit: Retrofit): WeatherAPI = retrofit.create(WeatherAPI::class.java)

    @Singleton
    @Provides
    fun provideWeatherRepository(
        weatherAPI: WeatherAPI
    ): WeatherRepository = WeatherRepositoryImpl(weatherAPI)
}