package com.jph.testdagger.di.component;

import com.jph.testdagger.MainActivity;
import com.jph.testdagger.di.module.MainModule;
import com.jph.testdagger.di.scope.PerTest;

import dagger.Component;

/**
 * Created by jph on 2016/9/19.
 */
@Component(dependencies = ApplicationComponent.class, modules = MainModule.class)
@PerTest
public interface MainComponent {
    void inject(MainActivity Activity);
}
