package com.sevanjoe.v2ex.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.sevanjoe.v2ex.R;
import com.sevanjoe.v2ex.bean.Topic;
import com.sevanjoe.v2ex.network.NetworkManager;
import com.sevanjoe.v2ex.network.NetworkUtils;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Sevan on 2015/11/19.
 */
public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.ViewHolder> {

    private List<Topic> topicList;

    public TopicAdapter(List<Topic> topicList) {
        this.topicList = topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
        this.notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topic_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.avatarImageView.setImageUrl(NetworkUtils.getImageUrl(topicList.get(position).getMember().getAvatar_normal()),
                NetworkManager.getInstance().getImageLoader());
        holder.textView.setText(topicList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return topicList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.topic_item_avatar)
        NetworkImageView avatarImageView;

        @Bind(R.id.topic_item_title)
        TextView textView;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
