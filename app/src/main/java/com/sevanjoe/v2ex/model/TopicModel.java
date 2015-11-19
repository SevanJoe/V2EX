package com.sevanjoe.v2ex.model;

import com.sevanjoe.v2ex.presenter.OnLoadTopicListener;

/**
 * Created by Sevan on 2015/11/19.
 */
public interface TopicModel {
    void loadHotTopics(OnLoadTopicListener onLoadTopicListener);
}
