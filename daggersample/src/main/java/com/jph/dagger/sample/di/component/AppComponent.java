package com.jph.dagger.sample.di.component;

import com.jph.dagger.sample.di.module.AppModule;
import com.jph.dagger.sample.di.module.MainModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jph on 2016/9/29.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

//    Toaster getToaster();

    MainComponent getMainComponent(MainModule mainModule);
}
