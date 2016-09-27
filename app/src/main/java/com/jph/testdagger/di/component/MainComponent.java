package com.jph.testdagger.di.component;

import com.jph.testdagger.MainActivity;
import com.jph.testdagger.di.scope.PerActivity;

import dagger.Component;

/**
 * Created by jph on 2016/9/19.
 */
@Component(dependencies = ApplicationComponent.class)
@PerActivity
public interface MainComponent {
    void inject(MainActivity Activity);
}
