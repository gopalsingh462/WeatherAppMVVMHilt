package com.example.weatherapp.ui;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.weatherapp.repositories.WeatherRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class MainViewModel_AssistedFactory implements ViewModelAssistedFactory<MainViewModel> {
  private final Provider<WeatherRepository> weatherRepository;

  @Inject
  MainViewModel_AssistedFactory(Provider<WeatherRepository> weatherRepository) {
    this.weatherRepository = weatherRepository;
  }

  @Override
  @NonNull
  public MainViewModel create(SavedStateHandle arg0) {
    return new MainViewModel(weatherRepository.get());
  }
}
