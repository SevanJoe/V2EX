package com.sevanjoe.v2ex.model.impl;

import com.sevanjoe.v2ex.bean.Topic;
import com.sevanjoe.v2ex.model.TopicModel;
import com.sevanjoe.v2ex.network.NetworkManager;
import com.sevanjoe.v2ex.presenter.OnLoadTopicListener;

import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Retrofit;

/**
 * Created by Sevan on 2015/11/19.
 */
public class TopicModelImpl implements TopicModel {
    @Override
    public void loadHotTopics(final OnLoadTopicListener onLoadTopicListener) {
        Call<List<Topic>> call = NetworkManager.getInstance().getApiService().loadHotTopics();
        call.enqueue(new Callback<List<Topic>>() {
            @Override
            public void onResponse(retrofit.Response<List<Topic>> response, Retrofit retrofit) {
                onLoadTopicListener.onLoadTopicSuccess(response.body());
            }

            @Override
            public void onFailure(Throwable t) {
                onLoadTopicListener.onLoadTopicFailed();
            }
        });
    }
}
