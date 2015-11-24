package com.sevanjoe.v2ex.app;

import android.app.Application;

import com.sevanjoe.v2ex.network.NetworkManager;

/**
 * Created by Sevan on 2015/11/18.
 */
public class V2EXApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        NetworkManager.getInstance().init();
    }
}
