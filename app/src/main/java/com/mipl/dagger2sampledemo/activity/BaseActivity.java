package com.mipl.dagger2sampledemo.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.mipl.dagger2sampledemo.DaggerApplication;

import javax.inject.Inject;

/**
 * TODO: Created by Rana Saha Roy on 1/5/2018.
 */

public class BaseActivity extends AppCompatActivity {

    @Inject
    public SharedPreferences preferences;
    @Inject
    public Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((DaggerApplication)getApplication()).getAppComponent().inject(this);
    }
}
