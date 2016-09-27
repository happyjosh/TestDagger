package com.jph.testdagger;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * Created by jph on 2016/9/19.
 */

public class MainPresenter {
    private static final String TAG = MainPresenter.class.getSimpleName();

    @Inject
    Context mContext;
//    @Inject
//    MainView mMainView;
    //    @Inject
//    Author mAuthor;
//    @Inject
//    Loader mLoader;

    @Inject
    public MainPresenter() {
    }


    //    @Inject
//    public MainPresenter(MainView mainView, Loader loader) {
//        mMainView = mainView;
//        mLoader = loader;
//    }
//
//    @Inject
//    public MainPresenter(MainView mainView, Author author) {
//        mMainView = mainView;
//        mAuthor = author;
//    }

    public void loadName() {
        //假装获取名称
        //获取名称成功
//        mMainView.setAuthorNameText(mLoader.getAuthor().getName());
//        Log.i(TAG, "" + mLoader.getAuthor());

        Toast.makeText(mContext, "Presenter注入的AppContext", Toast.LENGTH_SHORT).show();
    }
}
