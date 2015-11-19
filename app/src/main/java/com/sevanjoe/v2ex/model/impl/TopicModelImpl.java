package com.sevanjoe.v2ex.model.impl;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.sevanjoe.v2ex.bean.Topic;
import com.sevanjoe.v2ex.model.TopicModel;
import com.sevanjoe.v2ex.network.GsonRequest;
import com.sevanjoe.v2ex.network.NetworkConstants;
import com.sevanjoe.v2ex.network.NetworkManager;
import com.sevanjoe.v2ex.network.NetworkUtils;
import com.sevanjoe.v2ex.presenter.OnLoadTopicListener;

/**
 * Created by Sevan on 2015/11/19.
 */
public class TopicModelImpl implements TopicModel {
    @Override
    public void loadHotTopics(final OnLoadTopicListener onLoadTopicListener) {
        GsonRequest<Topic[]> gsonRequest = new GsonRequest<>(NetworkUtils.getUrl(NetworkConstants.TOPICS_HOT),
                Topic[].class, null, new Response.Listener<Topic[]>() {
            @Override
            public void onResponse(Topic[] response) {
                onLoadTopicListener.onLoadTopicSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                onLoadTopicListener.onLoadTopicFailed();
            }
        });
        NetworkManager.getInstance().addRequestQueue(gsonRequest);
    }
}
