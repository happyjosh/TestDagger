package com.jph.testdagger;

import javax.inject.Inject;

/**
 * Created by jph on 2016/9/19.
 */

public class MainPresenter {

    private MainView mMainView;
    private Author mAuthor;

    @Inject
    public MainPresenter(MainView mainView, Author author) {
        mMainView = mainView;
        mAuthor = author;
    }

    public void loadName() {
        //假装获取名称
        //获取名称成功
        mMainView.setAuthorNameText(mAuthor.getName());
    }
}
