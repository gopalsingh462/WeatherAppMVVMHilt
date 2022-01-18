package com.example.weatherapp.ui;

import com.example.weatherapp.repositories.WeatherRepository;
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
public final class MainViewModel_AssistedFactory_Factory implements Factory<MainViewModel_AssistedFactory> {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  public MainViewModel_AssistedFactory_Factory(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
  }

  @Override
  public MainViewModel_AssistedFactory get() {
    return newInstance(weatherRepositoryProvider);
  }

  public static MainViewModel_AssistedFactory_Factory create(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    return new MainViewModel_AssistedFactory_Factory(weatherRepositoryProvider);
  }

  public static MainViewModel_AssistedFactory newInstance(
      Provider<WeatherRepository> weatherRepository) {
    return new MainViewModel_AssistedFactory(weatherRepository);
  }
}
