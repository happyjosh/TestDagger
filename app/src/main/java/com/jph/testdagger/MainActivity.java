package com.jph.testdagger;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.jph.testdagger.di.component.DaggerMainComponent;
import com.jph.testdagger.di.module.MainModule;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView {

    @Inject
    Context mContext;

    @Inject
    MainPresenter mMainPresenter;

    @Bind(R.id.main_txt)
    TextView mAuthorNameTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder()
                .applicationComponent(((MyApplication) getApplication()).getApplicationComponent())
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
        ButterKnife.bind(this);

//        mMainPresenter = new MainPresenter(this);
    }

    @OnClick(R.id.main_btn)
    public void onClickBtn(View v) {
        mMainPresenter.loadName();
        Toast.makeText(mContext, "注入的AppContext", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setAuthorNameText(String name) {
        mAuthorNameTxt.setText(name);
    }
}
