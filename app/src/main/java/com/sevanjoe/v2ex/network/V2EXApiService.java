package com.sevanjoe.v2ex.network;

import com.sevanjoe.v2ex.bean.Topic;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by Sevan on 2015/11/24.
 */
public interface V2EXApiService {

    @GET("topics/hot.json")
    Call<List<Topic>> loadHotTopics();
}
