package com.example.shougang.iplay.inject.component;

import com.example.shougang.iplay.inject.module.SplashModule;
import com.example.shougang.iplay.ui.activity.SplashActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by aergt on 2017/7/6.
 */
@Singleton
@Component(modules = SplashModule.class)
public interface SplashComponent {
    void inject(SplashActivity activity);
}



