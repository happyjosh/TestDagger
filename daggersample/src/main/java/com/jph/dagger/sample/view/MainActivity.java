package com.jph.dagger.sample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.jph.dagger.sample.App;
import com.jph.dagger.sample.R;
import com.jph.dagger.sample.di.module.MainModule;
import com.jph.dagger.sample.model.UserInfo;
import com.jph.dagger.sample.presenter.MainPresenter;
import com.jph.dagger.sample.utils.Toaster;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    MainPresenter mMainPresenter;
    @Inject
    UserInfo mUserInfo;
    @Inject
    Toaster mToaster;

    @Bind(R.id.main_txt_name)
    TextView mNameTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ((App) getApplication()).getAppComponent().getMainComponent(new MainModule(this))
                .inject(this);
//        DaggerMainComponent.builder()
////                .appComponent(((App) getApplication()).getAppComponent())
//                .mainModule(new MainModule(this))
//                .build()
//                .inject(this);
    }

    @OnClick(R.id.main_btn_show_name)
    public void onClickShowName(View v) {
        mToaster.show("开始加载用户数据..");
        mMainPresenter.loadUserInfo();
        Log.i(TAG, "UserInfo: " + mUserInfo);
    }

    @Override
    public void showName(String name) {
        mNameTxt.setText(name);
    }
}
