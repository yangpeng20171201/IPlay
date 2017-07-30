package com.example.shougang.iplay.inject.module;

import com.example.shougang.iplay.presenter.contract.SplashContract;
import com.example.shougang.iplay.presenter.impl.SplashPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


/**
 * Created by aergt on 2017/7/6.
 */
@Module
public class SplashModule {
    SplashContract.Presenter splashPresenter;

    public SplashModule(SplashContract.View activity) {
        this.splashPresenter = new SplashPresenter(activity);
    }

    @Provides
    @Singleton
    SplashContract.Presenter providesMainPresenter() {
        return splashPresenter;
    }
}
