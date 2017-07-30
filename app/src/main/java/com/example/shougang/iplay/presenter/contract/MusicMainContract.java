package com.example.shougang.iplay.presenter.contract;

/**
 * Created by aergt on 2017/7/6.
 */

public interface MusicMainContract {
    interface View {
        void card2new(int id);

        void song2new();
    }

    interface Presenter {
        void cardEnvnt(int id);

        void songListEnvnt();
    }
}
