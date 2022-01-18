package com.example.weatherapp;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.weatherapp.data.remote.WeatherAPI;
import com.example.weatherapp.di.AppModule;
import com.example.weatherapp.di.AppModule_ProvideOKHttpClientFactory;
import com.example.weatherapp.di.AppModule_ProvideRetrofitFactory;
import com.example.weatherapp.di.AppModule_ProvideWeatherAPIFactory;
import com.example.weatherapp.di.AppModule_ProvideWeatherRepositoryFactory;
import com.example.weatherapp.repositories.WeatherRepository;
import com.example.weatherapp.ui.MainActivity;
import com.example.weatherapp.ui.MainViewModel_AssistedFactory;
import com.example.weatherapp.ui.MainViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerWeatherApplication_HiltComponents_ApplicationC extends WeatherApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object weatherAPI = new MemoizedSentinel();

  private volatile Object weatherRepository = new MemoizedSentinel();

  private volatile Provider<WeatherRepository> provideWeatherRepositoryProvider;

  private DaggerWeatherApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private OkHttpClient getOkHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideOKHttpClientFactory.provideOKHttpClient();
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideRetrofitFactory.provideRetrofit(getOkHttpClient());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private WeatherAPI getWeatherAPI() {
    Object local = weatherAPI;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = weatherAPI;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideWeatherAPIFactory.provideWeatherAPI(getRetrofit());
          weatherAPI = DoubleCheck.reentrantCheck(weatherAPI, local);
        }
      }
    }
    return (WeatherAPI) local;
  }

  private WeatherRepository getWeatherRepository() {
    Object local = weatherRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = weatherRepository;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideWeatherRepositoryFactory.provideWeatherRepository(getWeatherAPI());
          weatherRepository = DoubleCheck.reentrantCheck(weatherRepository, local);
        }
      }
    }
    return (WeatherRepository) local;
  }

  private Provider<WeatherRepository> getWeatherRepositoryProvider() {
    Object local = provideWeatherRepositoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideWeatherRepositoryProvider = (Provider<WeatherRepository>) local;
    }
    return (Provider<WeatherRepository>) local;
  }

  @Override
  public void injectWeatherApplication(WeatherApplication weatherApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public WeatherApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerWeatherApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements WeatherApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public WeatherApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends WeatherApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements WeatherApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public WeatherApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends WeatherApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<MainViewModel_AssistedFactory> mainViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private MainViewModel_AssistedFactory getMainViewModel_AssistedFactory() {
        return MainViewModel_AssistedFactory_Factory.newInstance(DaggerWeatherApplication_HiltComponents_ApplicationC.this.getWeatherRepositoryProvider());
      }

      private Provider<MainViewModel_AssistedFactory> getMainViewModel_AssistedFactoryProvider() {
        Object local = mainViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          mainViewModel_AssistedFactoryProvider = (Provider<MainViewModel_AssistedFactory>) local;
        }
        return (Provider<MainViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>singletonMap("com.example.weatherapp.ui.MainViewModel", (Provider) getMainViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerWeatherApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements WeatherApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public WeatherApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends WeatherApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerWeatherApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements WeatherApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public WeatherApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends WeatherApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements WeatherApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public WeatherApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends WeatherApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.example.weatherapp.ui.MainViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMainViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements WeatherApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public WeatherApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends WeatherApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.example.weatherapp.repositories.WeatherRepository 
        return (T) DaggerWeatherApplication_HiltComponents_ApplicationC.this.getWeatherRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}
