package com.sevanjoe.v2ex.presenter.impl;

import com.sevanjoe.v2ex.bean.Topic;
import com.sevanjoe.v2ex.model.TopicModel;
import com.sevanjoe.v2ex.model.impl.TopicModelImpl;
import com.sevanjoe.v2ex.presenter.MainPresenter;
import com.sevanjoe.v2ex.presenter.OnLoadTopicListener;
import com.sevanjoe.v2ex.ui.view.MainView;

import java.util.List;

/**
 * Created by Sevan on 2015/11/19.
 */
public class MainPresenterImpl implements MainPresenter, OnLoadTopicListener {
    private TopicModel topicModel;
    private MainView mainView;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
        this.topicModel = new TopicModelImpl();
    }

    @Override
    public void loadHotTopics() {
        this.topicModel.loadHotTopics(this);
    }

    @Override
    public void onLoadTopicSuccess(List<Topic> topicList) {
        this.mainView.loadSuccess();
        this.mainView.showHotTopics(topicList);
    }

    @Override
    public void onLoadTopicFailed() {
        this.mainView.loadFailed();
    }
}
