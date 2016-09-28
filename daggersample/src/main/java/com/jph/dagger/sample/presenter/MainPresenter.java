package com.jph.dagger.sample.presenter;

import android.util.Log;

import com.jph.dagger.sample.model.UserInfo;
import com.jph.dagger.sample.view.MainView;

import javax.inject.Inject;

/**
 * Created by jph on 2016/9/22.
 */

public class MainPresenter {
    private static final String TAG = MainPresenter.class.getSimpleName();

    MainView mMainView;
    @Inject
    UserInfo mUserInfo;

    @Inject
    public MainPresenter(MainView mainView) {
//    public MainPresenter(MainView mainView, @Named(value = "jph") UserInfo userInfo) {
        mMainView = mainView;
//        mUserInfo = userInfo;
    }

    public void loadUserInfo() {
        //假装获取了数据- -
//        UserInfo userInfo = new UserInfo("灰来灰去");

        mMainView.showName(mUserInfo.getName());//显示名称
        Log.i(TAG, "UserInfo: " + mUserInfo);
    }
}
