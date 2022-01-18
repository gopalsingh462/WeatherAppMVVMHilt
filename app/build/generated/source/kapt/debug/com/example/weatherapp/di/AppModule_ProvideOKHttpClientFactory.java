package com.example.weatherapp.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideOKHttpClientFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return provideOKHttpClient();
  }

  public static AppModule_ProvideOKHttpClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient provideOKHttpClient() {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideOKHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideOKHttpClientFactory INSTANCE = new AppModule_ProvideOKHttpClientFactory();
  }
}
