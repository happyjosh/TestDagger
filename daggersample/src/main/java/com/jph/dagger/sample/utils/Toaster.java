package com.jph.dagger.sample.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by jph on 2016/9/29.
 */

public class Toaster {
    private Context mContext;

    public Toaster(Context context) {
        mContext = context;
    }

    public void show(String message) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }
}
