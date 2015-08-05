package com.first.coolweather.util;

/**
 * Created by Zora on 2015/8/4.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
