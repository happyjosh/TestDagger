package com.jph.testdagger.di.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jph on 2016/9/20.
 */
@Module
public class ApplicationModule {

    Context mContext;

    public ApplicationModule(Context context) {
        mContext = context;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return mContext;
    }
}
