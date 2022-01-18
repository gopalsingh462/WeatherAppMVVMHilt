package com.example.weatherapp.repositories;

import com.example.weatherapp.data.remote.WeatherAPI;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherRepositoryImpl_Factory implements Factory<WeatherRepositoryImpl> {
  private final Provider<WeatherAPI> weatherAPIProvider;

  public WeatherRepositoryImpl_Factory(Provider<WeatherAPI> weatherAPIProvider) {
    this.weatherAPIProvider = weatherAPIProvider;
  }

  @Override
  public WeatherRepositoryImpl get() {
    return newInstance(weatherAPIProvider.get());
  }

  public static WeatherRepositoryImpl_Factory create(Provider<WeatherAPI> weatherAPIProvider) {
    return new WeatherRepositoryImpl_Factory(weatherAPIProvider);
  }

  public static WeatherRepositoryImpl newInstance(WeatherAPI weatherAPI) {
    return new WeatherRepositoryImpl(weatherAPI);
  }
}
