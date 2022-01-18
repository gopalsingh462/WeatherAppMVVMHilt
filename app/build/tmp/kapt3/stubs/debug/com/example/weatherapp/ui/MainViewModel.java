package com.example.weatherapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/weatherapp/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "weatherRepository", "Lcom/example/weatherapp/repositories/WeatherRepository;", "(Lcom/example/weatherapp/repositories/WeatherRepository;)V", "_weatherData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/weatherapp/other/Event;", "Lcom/example/weatherapp/other/Resource;", "Lcom/example/weatherapp/data/remote/responses/WeatherResponse;", "weatherData", "Landroidx/lifecycle/LiveData;", "getWeatherData", "()Landroidx/lifecycle/LiveData;", "getWeatherInfo", "", "query", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.weatherapp.other.Event<com.example.weatherapp.other.Resource<com.example.weatherapp.data.remote.responses.WeatherResponse>>> _weatherData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.weatherapp.other.Event<com.example.weatherapp.other.Resource<com.example.weatherapp.data.remote.responses.WeatherResponse>>> weatherData = null;
    private final com.example.weatherapp.repositories.WeatherRepository weatherRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.weatherapp.other.Event<com.example.weatherapp.other.Resource<com.example.weatherapp.data.remote.responses.WeatherResponse>>> getWeatherData() {
        return null;
    }
    
    public final void getWeatherInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.repositories.WeatherRepository weatherRepository) {
        super();
    }
}