package com.jph.testdagger;

import com.jph.testdagger.di.component.ApplicationComponent;
import com.jph.testdagger.di.component.DaggerApplicationComponent;
import com.jph.testdagger.di.module.ApplicationModule;

/**
 * Created by jph on 2016/9/20.
 */
public class MyApplication extends android.app.Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
