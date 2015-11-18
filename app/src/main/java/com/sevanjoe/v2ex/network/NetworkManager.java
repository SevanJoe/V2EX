package com.sevanjoe.v2ex.network;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Sevan on 2015/11/18.
 */
public class NetworkManager {
    private static NetworkManager ourInstance;

    private RequestQueue requestQueue;

    public static NetworkManager getInstance() {
        if (ourInstance == null) {
            ourInstance = new NetworkManager();
        }
        return ourInstance;
    }

    private NetworkManager() {
    }

    public void init(Context context) {
        requestQueue = Volley.newRequestQueue(context);
    }

    public <T> void addRequestQueue(Request<T> request) {
        requestQueue.add(request);
    }
}
