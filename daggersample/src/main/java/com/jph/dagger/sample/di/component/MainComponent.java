package com.jph.dagger.sample.di.component;

import com.jph.dagger.sample.di.module.MainModule;
import com.jph.dagger.sample.di.scope.PerActivity;
import com.jph.dagger.sample.view.MainActivity;

import dagger.Subcomponent;

/**
 * Created by jph on 2016/9/22.
 */
@PerActivity
@Subcomponent(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
