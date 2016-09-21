package com.jph.testdagger.di.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by jph on 2016/9/19.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface QualifierProperty {
    String value() default "";
}
