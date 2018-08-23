package com.example.arouter.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.arouter.R;

@Route(path = "/test/activity1")
public class Test1Activity extends AppCompatActivity {

    @Autowired
    String key1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_1test);


        String value = getIntent().getStringExtra("key1");
        if (!TextUtils.isEmpty(value)) {
            Toast.makeText(this, "exist param :" + value, Toast.LENGTH_LONG).show();
        }

        setResult(999);
    }
}
