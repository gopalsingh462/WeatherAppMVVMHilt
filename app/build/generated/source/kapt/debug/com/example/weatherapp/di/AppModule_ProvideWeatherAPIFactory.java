package com.example.weatherapp.di;

import com.example.weatherapp.data.remote.WeatherAPI;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideWeatherAPIFactory implements Factory<WeatherAPI> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideWeatherAPIFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public WeatherAPI get() {
    return provideWeatherAPI(retrofitProvider.get());
  }

  public static AppModule_ProvideWeatherAPIFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideWeatherAPIFactory(retrofitProvider);
  }

  public static WeatherAPI provideWeatherAPI(Retrofit retrofit) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideWeatherAPI(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
