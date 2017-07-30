package com.example.shougang.iplay.inject.module;

import com.example.shougang.iplay.ui.fragment.MainLiveFragment;
import com.example.shougang.iplay.ui.fragment.MainMusicFragment;
import com.example.shougang.iplay.ui.fragment.MainVideoFragment;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aergt on 2017/7/6.
 */
@Module
public class MainModule {
    @Provides
    @Singleton
    MainMusicFragment providesMainFragment() {
        return new MainMusicFragment();
    }

    @Provides
    @Singleton
    MainVideoFragment providesMainVideoFragment() {
        return new MainVideoFragment();
    }

    @Provides
    @Singleton
    MainLiveFragment providesMainLiveFragment() {
        return new MainLiveFragment();
    }
}
