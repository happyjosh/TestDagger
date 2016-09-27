package com.jph.dagger.sample.presenter;

import com.jph.dagger.sample.model.UserInfo;
import com.jph.dagger.sample.view.MainView;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by jph on 2016/9/22.
 */

public class MainPresenter {

    MainView mMainView;
    @Inject
    @Named(value = "hui")
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
    }
}
