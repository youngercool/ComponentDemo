package com.example.younger.componentdemo.runalone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.younger.componentdemo.R;

@Route(path = "/runa/RunAloneDebug")
public class RunAloneDebugActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_debug_runalone);
    }
}
