package com.example.shougang.iplay.inject.component;

import com.example.shougang.iplay.inject.module.MainMusicAdapterModule;
import com.example.shougang.iplay.ui.fragment.MainMusicFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by aergt on 2017/7/6.
 */
@Singleton
@Component(modules = MainMusicAdapterModule.class)
public interface MusicAdapterComponent {
    void inject(MainMusicFragment activity);
}
