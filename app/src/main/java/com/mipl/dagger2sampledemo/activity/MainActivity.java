package com.mipl.dagger2sampledemo.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mipl.dagger2sampledemo.R;
import com.mipl.dagger2sampledemo.activity.BaseActivity;
import com.mipl.dagger2sampledemo.databinding.ActivityMainBinding;

import javax.inject.Inject;

/**
 * TODO: Created by Rana Saha Roy on 1/5/2018.
 */

public class MainActivity extends BaseActivity {

    private ActivityMainBinding viewBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        preferences.edit().putInt("number", 6).apply();

        viewBinding.textview.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
        viewBinding.textview.setTextColor(context.getResources().getColor(android.R.color.white));
        viewBinding.textview.setText("The number is " +preferences.getInt("number",0));

        Log.e("Rana_MainActivity: ","The value of the number is- "+preferences.getInt("number",0));
    }
}
