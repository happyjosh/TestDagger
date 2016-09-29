package com.jph.dagger.sample;

import android.app.Application;

import com.jph.dagger.sample.di.component.AppComponent;
import com.jph.dagger.sample.di.component.DaggerAppComponent;
import com.jph.dagger.sample.di.module.AppModule;

/**
 * Created by jph on 2016/9/29.
 */

public class App extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
