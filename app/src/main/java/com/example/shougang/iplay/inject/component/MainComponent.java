package com.example.shougang.iplay.inject.component;

import com.example.shougang.iplay.inject.module.MainModule;
import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by aergt on 2017/7/6.
 */
@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
}
