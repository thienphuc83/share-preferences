package com.example.share_preferences;

import android.content.Context;
import android.content.SharedPreferences;

// put get data
public class MySharePreferences {

    // tên của SharedPreferences
    private static final String MY_SHARE_PREFERENCES = "MY_SHARE_PREFERENCES";

    // tạo 1 biến môi trường
    private Context mContext;

    // tạo constructor cho SharedPreferences
    public MySharePreferences(Context mContext) {
        this.mContext = mContext;
    }

    // 2 hàm put và get data cho việc check lần đầu install app - kiểu boolean
    public void putBooleanValue(String key, boolean value) {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(MY_SHARE_PREFERENCES,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public boolean getBooleanValue(String key) {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(MY_SHARE_PREFERENCES,
                Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(key, false);
    }

    // 2 hàm put và get data username - kiểu string
    public void putStringValue(String key, String value) {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(MY_SHARE_PREFERENCES,
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public String getStringValue(String key) {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(MY_SHARE_PREFERENCES,
                Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, "");
    }
}










