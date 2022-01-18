package com.example.weatherapp.ui;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = MainViewModel.class
)
public interface MainViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.weatherapp.ui.MainViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(MainViewModel_AssistedFactory factory);
}
