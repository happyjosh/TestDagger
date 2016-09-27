package com.jph.dagger.sample.di.component;

import com.jph.dagger.sample.di.module.MainModule;
import com.jph.dagger.sample.view.MainActivity;

import dagger.Component;

/**
 * Created by jph on 2016/9/22.
 */
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
