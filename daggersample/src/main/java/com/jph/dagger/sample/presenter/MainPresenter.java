package com.jph.dagger.sample.presenter;

import com.jph.dagger.sample.model.UserInfo;
import com.jph.dagger.sample.view.MainView;

import javax.inject.Inject;

/**
 * Created by jph on 2016/9/22.
 */

public class MainPresenter {

    MainView mMainView;

    @Inject
    public MainPresenter(MainView mainView) {
        mMainView = mainView;
    }

    public void loadUserInfo() {
        //假装获取了数据- -
        UserInfo userInfo = new UserInfo("灰来灰去");

        mMainView.showName(userInfo.getName());//显示名称
    }
}
