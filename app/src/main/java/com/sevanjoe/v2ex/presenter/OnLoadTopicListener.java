package com.sevanjoe.v2ex.presenter;

import com.sevanjoe.v2ex.bean.Topic;

import java.util.List;

/**
 * Created by Sevan on 2015/11/19.
 */
public interface OnLoadTopicListener {
    void onLoadTopicSuccess(List<Topic> topicList);

    void onLoadTopicFailed();
}
