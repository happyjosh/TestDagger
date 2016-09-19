package com.jph.testdagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView {

    @Inject
    MainPresenter mMainPresenter;

    @Bind(R.id.main_txt)
    TextView mAuthorNameTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
        ButterKnife.bind(this);

//        mMainPresenter = new MainPresenter(this);
    }

    @OnClick(R.id.main_btn)
    public void onClickBtn(View v) {
        mMainPresenter.loadName();
    }

    @Override
    public void setAuthorNameText(String name) {
        mAuthorNameTxt.setText(name);
    }
}
