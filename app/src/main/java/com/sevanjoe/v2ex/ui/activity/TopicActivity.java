package com.sevanjoe.v2ex.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.sevanjoe.v2ex.R;
import com.sevanjoe.v2ex.bean.Topic;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TopicActivity extends AppCompatActivity {

    private static final String BUNDLE_TOPIC = "TOPIC";

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Bind(R.id.fab)
    FloatingActionButton floatingActionButton;

    @Bind(R.id.topic_recycler_view)
    RecyclerView recyclerView;

    private Topic topic;

    public static void start(Context context, Topic topic) {
        Intent intent = new Intent(context, TopicActivity.class);
        intent.putExtra(BUNDLE_TOPIC, topic);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        initSystemView();

        initMainView();
    }

    private void initSystemView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initMainView() {
        topic = getIntent().getParcelableExtra(BUNDLE_TOPIC);
        Log.d("t", "t");
    }
}
