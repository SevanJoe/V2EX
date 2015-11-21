package com.sevanjoe.v2ex.network;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

/**
 * Created by Sevan on 2015/11/18.
 */
public class NetworkManager {

    private static final int IMAGE_CACHE_COUNT_MAX = 20;

    private static NetworkManager instance;

    private RequestQueue requestQueue;

    private ImageLoader imageLoader;

    private NetworkManager() {
    }

    public static NetworkManager getInstance() {
        if (instance == null) {
            instance = new NetworkManager();
        }
        return instance;
    }

    public void init(Context context) {
        requestQueue = Volley.newRequestQueue(context);

        imageLoader = new ImageLoader(requestQueue, new ImageLoader.ImageCache() {

            private final LruCache<String, Bitmap> cache = new LruCache<>(IMAGE_CACHE_COUNT_MAX);

            @Override
            public Bitmap getBitmap(String url) {
                return cache.get(url);
            }

            @Override
            public void putBitmap(String url, Bitmap bitmap) {
                cache.put(url, bitmap);
            }
        });
    }

    public <T> void addRequestQueue(Request<T> request) {
        requestQueue.add(request);
    }

    public ImageLoader getImageLoader() {
        return imageLoader;
    }
}
