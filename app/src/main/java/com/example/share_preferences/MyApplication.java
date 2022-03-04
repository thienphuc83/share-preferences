package com.example.share_preferences;

import android.app.Application;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // khởi tạo DataLocalMananger ở đây, để có thể dùng DataLocalMananger ở nhiều activity khác nhau.
        try {
            DataLocalManager.init(getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
