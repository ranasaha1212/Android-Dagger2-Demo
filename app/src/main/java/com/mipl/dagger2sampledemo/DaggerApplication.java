package com.mipl.dagger2sampledemo;

import android.app.Application;

import com.mipl.dagger2sampledemo.di.AppComponent;
import com.mipl.dagger2sampledemo.di.DaggerAppComponent;
import com.mipl.dagger2sampledemo.module.AppModule;

/**
 * TODO: Created by Rana Saha Roy on 1/5/2018.
 */

public class DaggerApplication extends Application {

    public AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent.inject(this);
    }


    public AppComponent getAppComponent(){
        return appComponent;
    }
}
