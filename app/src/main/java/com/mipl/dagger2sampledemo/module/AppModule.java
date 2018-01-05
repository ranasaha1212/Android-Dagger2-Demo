package com.mipl.dagger2sampledemo.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.mipl.dagger2sampledemo.DaggerApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * TODO: Created by Rana Saha Roy on 1/5/2018.
 */

@Module
public class AppModule {

    private final DaggerApplication application;

    public AppModule(DaggerApplication app){
        this.application = app;
    }


    @Provides @Singleton
    Context providesApplicationContext(){
        return application;
    }

    @Provides @Singleton
    SharedPreferences providesSharedPreferences(Context app){
        return app.getSharedPreferences("My_Prefs_Title", Context.MODE_PRIVATE);
    }
}
