package com.jack.volley;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by jack on 16-7-28.
 * 创建一个全局的请求队列
 */
public class MyApplication extends Application{
    private static RequestQueue queue;
    public void onCreate(){
        super.onCreate();
        queue= Volley.newRequestQueue(getApplicationContext());

    }
    public static RequestQueue getHttpQueues(){
        return queue;

    }

}
