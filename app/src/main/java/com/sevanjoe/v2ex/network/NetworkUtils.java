package com.sevanjoe.v2ex.network;

/**
 * Created by Sevan on 2015/11/18.
 */
public class NetworkUtils {
    private static final String ROOT_URL = "https://www.v2ex.com/api/";
    private static final String URL_PREFIX = "http:";
    private static final String URL_SUFFIX = ".json";

    public static String getUrl(String api) {
        return ROOT_URL + api + URL_SUFFIX;
    }

    public static String getImageUrl(String imageUrl) {
        return URL_PREFIX + imageUrl;
    }
}
