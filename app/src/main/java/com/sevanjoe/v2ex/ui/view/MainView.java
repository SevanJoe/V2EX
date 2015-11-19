package com.sevanjoe.v2ex.ui.view;

import com.sevanjoe.v2ex.bean.Topic;

/**
 * Created by Sevan on 2015/11/19.
 */
public interface MainView {
    void showHotTopics(Topic[] topics);

    void loadFailed();
}
