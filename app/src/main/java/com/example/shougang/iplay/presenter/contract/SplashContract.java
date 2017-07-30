package com.example.shougang.iplay.presenter.contract;

/**
 * 启动页相关接口
 * Created by aergt on 2017/7/6.
 */

public interface SplashContract {

    /**
     * view接口
     */
    interface View {
        void intent2Act();
    }

    /**
     * presenter接口
     */
    interface Presenter {
        void timingBegin();

        void startIntent();
    }
}