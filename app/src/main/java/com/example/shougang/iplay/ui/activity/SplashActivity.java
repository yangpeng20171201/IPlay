package com.example.shougang.iplay.ui.activity;


import android.os.Bundle;
import android.os.PersistableBundle;

import com.example.shougang.iplay.R;
import com.example.shougang.iplay.inject.module.SplashModule;
import com.example.shougang.iplay.presenter.contract.SplashContract;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.internal.DaggerCollections;

/**
 * Created by aergt on 2017/7/6.
 * 启动页
 */

public class SplashActivity extends BaseActivity implements SplashContract.View {
    //presenter层对象  接口类型
    @Inject
    SplashContract.Presenter presenter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //绑定当前页面根布局
        ButterKnife.bind(this);

    }

    @Override
    public void intent2Act() {

    }
}
