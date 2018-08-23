package com.example.basiclib;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;

public class BaseApplication extends Application {

    private static BaseApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();     // 打印日志
        ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.init( this ); // 尽可能早，推荐在Application中初始化

    }

    public static BaseApplication getInstance() {
        return instance;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // 65535
//        MultiDex.install(this);
    }
}
