package com.example.odm.vr_teacher_client.application;

import android.app.Application;
import android.content.Context;

/**
 * @description: 全局Application
 * @author: ODM
 * @date: 2019/10/27
 */
public class TeacherClient extends Application {

    /**
     * 可能导致内存泄漏的全局静态Context
     */
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context  = getApplicationContext();

    }

    public static Context getContext() {
        return context;
    }


}
