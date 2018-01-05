package com.mipl.dagger2sampledemo.di;

import com.mipl.dagger2sampledemo.DaggerApplication;
import com.mipl.dagger2sampledemo.activity.MainActivity;
import com.mipl.dagger2sampledemo.activity.BaseActivity;
import com.mipl.dagger2sampledemo.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * TODO: Created by Rana Saha Roy on 1/5/2018.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(DaggerApplication daggerApplication);
    void inject(MainActivity mainActivity);
    void inject(BaseActivity baseActivity);
}
