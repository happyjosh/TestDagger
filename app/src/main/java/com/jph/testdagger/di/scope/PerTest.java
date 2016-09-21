package com.jph.testdagger.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by jph on 2016/9/20.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerTest {
}
