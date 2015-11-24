package com.sevanjoe.v2ex.network;

/**
 * Created by Sevan on 2015/11/18.
 */
public class NetworkUtils {
    public static final String ROOT_URL = "https://www.v2ex.com/api/";

    private static final String URL_PREFIX = "http:";

    public static String getImageUrl(String imageUrl) {
        if (imageUrl.startsWith("//")) {
            return URL_PREFIX + imageUrl;
        } else {
            return imageUrl;
        }
    }
}
