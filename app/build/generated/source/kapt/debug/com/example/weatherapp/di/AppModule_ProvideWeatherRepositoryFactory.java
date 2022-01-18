package com.example.weatherapp.di;

import com.example.weatherapp.data.remote.WeatherAPI;
import com.example.weatherapp.repositories.WeatherRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideWeatherRepositoryFactory implements Factory<WeatherRepository> {
  private final Provider<WeatherAPI> weatherAPIProvider;

  public AppModule_ProvideWeatherRepositoryFactory(Provider<WeatherAPI> weatherAPIProvider) {
    this.weatherAPIProvider = weatherAPIProvider;
  }

  @Override
  public WeatherRepository get() {
    return provideWeatherRepository(weatherAPIProvider.get());
  }

  public static AppModule_ProvideWeatherRepositoryFactory create(
      Provider<WeatherAPI> weatherAPIProvider) {
    return new AppModule_ProvideWeatherRepositoryFactory(weatherAPIProvider);
  }

  public static WeatherRepository provideWeatherRepository(WeatherAPI weatherAPI) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideWeatherRepository(weatherAPI), "Cannot return null from a non-@Nullable @Provides method");
  }
}
