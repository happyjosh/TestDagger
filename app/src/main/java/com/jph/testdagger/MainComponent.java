package com.jph.testdagger;

import dagger.Component;

/**
 * Created by jph on 2016/9/19.
 */
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity Activity);
}
