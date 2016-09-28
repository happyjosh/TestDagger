package com.jph.dagger.sample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.jph.dagger.sample.R;
import com.jph.dagger.sample.di.component.DaggerMainComponent;
import com.jph.dagger.sample.di.module.MainModule;
import com.jph.dagger.sample.model.UserInfo;
import com.jph.dagger.sample.presenter.MainPresenter;

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

    @Bind(R.id.main_txt_name)
    TextView mNameTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
    }

    @OnClick(R.id.main_btn_show_name)
    public void onClickShowName(View v) {
        mMainPresenter.loadUserInfo();
        Log.i(TAG, "UserInfo: " + mUserInfo);
    }

    @Override
    public void showName(String name) {
        mNameTxt.setText(name);
    }
}
