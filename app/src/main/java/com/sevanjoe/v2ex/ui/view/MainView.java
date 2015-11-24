package com.sevanjoe.v2ex.ui.view;

import com.sevanjoe.v2ex.bean.Topic;

import java.util.List;

/**
 * Created by Sevan on 2015/11/19.
 */
public interface MainView {
    void showHotTopics(List<Topic> topicList);

    void loadSuccess();

    void loadFailed();
}
