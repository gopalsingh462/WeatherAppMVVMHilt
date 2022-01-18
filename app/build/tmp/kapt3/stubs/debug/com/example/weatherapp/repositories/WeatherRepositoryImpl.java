package com.example.weatherapp.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/weatherapp/repositories/WeatherRepositoryImpl;", "Lcom/example/weatherapp/repositories/WeatherRepository;", "weatherAPI", "Lcom/example/weatherapp/data/remote/WeatherAPI;", "(Lcom/example/weatherapp/data/remote/WeatherAPI;)V", "getWeatherInfo", "Lcom/example/weatherapp/other/Resource;", "Lcom/example/weatherapp/data/remote/responses/WeatherResponse;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherRepositoryImpl implements com.example.weatherapp.repositories.WeatherRepository {
    private final com.example.weatherapp.data.remote.WeatherAPI weatherAPI = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getWeatherInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.weatherapp.other.Resource<com.example.weatherapp.data.remote.responses.WeatherResponse>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public WeatherRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.data.remote.WeatherAPI weatherAPI) {
        super();
    }
}