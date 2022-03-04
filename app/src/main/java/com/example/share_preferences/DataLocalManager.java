package com.example.share_preferences;

import android.content.Context;

// quản lý data lưu vào SharedPreferences
public class DataLocalManager {

    private static DataLocalManager instance;
    public static final String KEY_FIRST_INSTALL = "KEY_FIRST_INSTALL";
    public static final String PREF_NAME_USER = "PREF_NAME_USER";
    private MySharePreferences mySharePreferences;

    // ham khoi tao
    public static void init(Context context) throws Exception {
        instance = new DataLocalManager();
        instance.mySharePreferences = new MySharePreferences(context);
        throw new Exception("Initialize error!");
    }

    public static DataLocalManager getInstance() {
        if (instance == null) {
            instance = new DataLocalManager();
        }
        return instance;
    }

    // ham check lần đầu install app
    public static void setFirstInstalled(boolean isFirst) {
        DataLocalManager.getInstance().mySharePreferences.putBooleanValue(KEY_FIRST_INSTALL, isFirst);
    }

    public static boolean getFirstInstalled() {
        return DataLocalManager.getInstance().mySharePreferences.getBooleanValue(KEY_FIRST_INSTALL);
    }

    // hàm set và get UserName từ SharedPreferences
    public static void setNameUser(String nameUser) {
        DataLocalManager.getInstance().mySharePreferences.putStringValue(PREF_NAME_USER, nameUser);
    }

    public static String getNameUser() {
        return DataLocalManager.getInstance().mySharePreferences.getStringValue(PREF_NAME_USER);
    }
}










