package com.sevanjoe.v2ex.network;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by Sevan on 2015/11/18.
 */
public class NetworkManager {

    private static final int IMAGE_CACHE_COUNT_MAX = 20;

    private static NetworkManager instance;

    private V2EXApiService apiService;

    private NetworkManager() {
    }

    public static NetworkManager getInstance() {
        if (instance == null) {
            instance = new NetworkManager();
        }
        return instance;
    }

    public void init() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(NetworkUtils.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(V2EXApiService.class);
    }

    public V2EXApiService getApiService() {
        return this.apiService;
    }
}
