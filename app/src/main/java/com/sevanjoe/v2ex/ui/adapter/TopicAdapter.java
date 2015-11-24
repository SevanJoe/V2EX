package com.sevanjoe.v2ex.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sevanjoe.v2ex.R;
import com.sevanjoe.v2ex.bean.Member;
import com.sevanjoe.v2ex.bean.Topic;
import com.sevanjoe.v2ex.network.NetworkUtils;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Sevan on 2015/11/19.
 */
public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.ViewHolder> {

    private Context context;

    private List<Topic> topicList;

    public TopicAdapter(Context context, List<Topic> topicList) {
        this.context = context;
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
        Topic topic = topicList.get(position);
        Member member = topic.getMember();
        Picasso.with(context).load(NetworkUtils.getImageUrl(member.getAvatar_normal())).into(holder.avatarImageView);
        holder.tileTextView.setText(topic.getTitle());
        holder.nodeTitleTextView.setText(topic.getNode().getTitle());
        holder.authorNameTextView.setText(member.getUsername());
        holder.createTimeTextView.setText(String.valueOf(topic.getCreated()));
        holder.replyCountTextView.setText(String.valueOf(topic.getReplies()));
    }

    @Override
    public int getItemCount() {
        return topicList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.topic_item_avatar)
        ImageView avatarImageView;

        @Bind(R.id.topic_item_title)
        TextView tileTextView;

        @Bind(R.id.topic_item_node_title)
        TextView nodeTitleTextView;

        @Bind(R.id.topic_item_author_name)
        TextView authorNameTextView;

        @Bind(R.id.topic_item_create_time)
        TextView createTimeTextView;

        @Bind(R.id.topic_item_reply_count)
        TextView replyCountTextView;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
