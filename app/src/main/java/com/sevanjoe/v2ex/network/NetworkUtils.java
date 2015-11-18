package com.sevanjoe.v2ex.network;

/**
 * Created by Sevan on 2015/11/18.
 */
public class NetworkUtils {
    public static final String ROOT_URL = "https://www.v2ex.com/api/";
    public static final String URL_SUFFIX = ".json";

    public static String getUrl(String api) {
        return ROOT_URL + api + URL_SUFFIX;
    }
}
