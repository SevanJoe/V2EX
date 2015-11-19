package com.sevanjoe.v2ex.presenter;

import com.sevanjoe.v2ex.bean.Topic;

/**
 * Created by Sevan on 2015/11/19.
 */
public interface OnLoadTopicListener {
    void onLoadTopicSuccess(Topic[] topics);

    void onLoadTopicFailed();
}
