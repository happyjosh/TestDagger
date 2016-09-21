package com.jph.testdagger.di.component;

import android.content.Context;

import com.jph.testdagger.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jph on 2016/9/20.
 */

@Component(modules = ApplicationModule.class)
@Singleton
public interface ApplicationComponent {

    Context getContext();
}
