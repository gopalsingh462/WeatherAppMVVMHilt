package com.example.weatherapp;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.internal.GeneratedEntryPoint;
import javax.annotation.Generated;

@OriginatingElement(
    topLevelClass = WeatherApplication.class
)
@GeneratedEntryPoint
@InstallIn(ApplicationComponent.class)
@Generated("dagger.hilt.android.processor.internal.androidentrypoint.InjectorEntryPointGenerator")
public interface WeatherApplication_GeneratedInjector {
  void injectWeatherApplication(WeatherApplication weatherApplication);
}
