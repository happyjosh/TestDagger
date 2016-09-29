package com.jph.dagger.sample.di.module;

import android.content.Context;

import com.jph.dagger.sample.utils.Toaster;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jph on 2016/9/29.
 */
@Module
public class AppModule {
    Context mContext;

    public AppModule(Context context) {
        mContext = context;
    }

    @Provides
    @Singleton
    public Toaster provideToaster() {
        return new Toaster(mContext);
    }
}
