package com.example.shougang.iplay.inject.module;

import android.content.Context;

import com.example.shougang.iplay.presenter.contract.MusicMainContract;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aergt on 2017/7/6.
 */
@Module
public class MainMusicAdapterModule {
    Context context;
    ArrayList<String> list;
    private MusicMainContract.View view;

    @Provides
    MusicMainContract.View  getMusicMainPresenter() {
        return view;
    }
    public MainMusicAdapterModule(Context context, ArrayList<String> list, MusicMainContract.View view) {
        this.context = context;
        this.list = list;
        this.view = view;
    }

    @Provides
    Context providesContext() {
        return context;
    }

    @Provides
    ArrayList<String> providesArrayList() {
        return list;
    }
}
