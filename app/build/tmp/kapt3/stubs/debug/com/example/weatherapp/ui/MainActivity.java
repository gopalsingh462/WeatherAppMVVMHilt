package com.example.weatherapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010\u001f\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/weatherapp/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/weatherapp/databinding/ActivityMainBinding;", "cityList", "", "Lcom/example/weatherapp/models/City;", "getCityList", "()Ljava/util/List;", "setCityList", "(Ljava/util/List;)V", "viewModel", "Lcom/example/weatherapp/ui/MainViewModel;", "bindDataToViews", "", "weatherData", "Lcom/example/weatherapp/data/remote/responses/WeatherResponse;", "hideProgressAndShowContent", "hideProgressAndShowError", "errorMessage", "", "initViewModel", "observeViewModel", "onBtnViewWeatherClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setCitySpinner", "showProgress", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.weatherapp.databinding.ActivityMainBinding binding;
    private com.example.weatherapp.ui.MainViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.weatherapp.models.City> cityList;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weatherapp.models.City> getCityList() {
        return null;
    }
    
    public final void setCityList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weatherapp.models.City> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViewModel() {
    }
    
    private final void observeViewModel() {
    }
    
    private final void showProgress() {
    }
    
    private final void hideProgressAndShowContent() {
    }
    
    private final void hideProgressAndShowError(java.lang.String errorMessage) {
    }
    
    private final void setCitySpinner() {
    }
    
    public final void onBtnViewWeatherClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void bindDataToViews(com.example.weatherapp.data.remote.responses.WeatherResponse weatherData) {
    }
    
    public MainActivity() {
        super();
    }
}