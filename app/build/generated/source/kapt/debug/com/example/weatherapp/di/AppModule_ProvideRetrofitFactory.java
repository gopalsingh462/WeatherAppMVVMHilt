package com.example.weatherapp.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> clientProvider;

  public AppModule_ProvideRetrofitFactory(Provider<OkHttpClient> clientProvider) {
    this.clientProvider = clientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(clientProvider.get());
  }

  public static AppModule_ProvideRetrofitFactory create(Provider<OkHttpClient> clientProvider) {
    return new AppModule_ProvideRetrofitFactory(clientProvider);
  }

  public static Retrofit provideRetrofit(OkHttpClient client) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRetrofit(client), "Cannot return null from a non-@Nullable @Provides method");
  }
}
