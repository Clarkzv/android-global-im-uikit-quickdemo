package com.rongcloud.im.uikit.quickdemo;

import android.app.Application;

import io.rong.imlib.RongCoreClient;
import io.rong.imlib.model.InitOption;

public class DemoApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        String appKey = "y745wfm8yg89v"; // YourAppKey
        InitOption initOption = new InitOption.Builder().enablePush(true).build();
        RongCoreClient.init(this, appKey, initOption);
    }
}
