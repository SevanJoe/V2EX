package com.sevanjoe.v2ex.model.impl;

import com.sevanjoe.v2ex.bean.Topic;
import com.sevanjoe.v2ex.model.TopicModel;
import com.sevanjoe.v2ex.network.NetworkManager;
import com.sevanjoe.v2ex.presenter.OnLoadTopicListener;

import java.util.List;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Sevan on 2015/11/19.
 */
public class TopicModelImpl implements TopicModel {
    @Override
    public void loadHotTopics(final OnLoadTopicListener onLoadTopicListener) {
        Observable<List<Topic>> hotTopics = NetworkManager.getInstance().getApiService().loadHotTopics();
        hotTopics.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<List<Topic>>() {
                    @Override
                    public void call(List<Topic> topics) {
                        onLoadTopicListener.onLoadTopicSuccess(topics);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLoadTopicListener.onLoadTopicFailed();
                    }
                });
    }
}
