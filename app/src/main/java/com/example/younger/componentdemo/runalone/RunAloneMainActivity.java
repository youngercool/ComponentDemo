package com.example.younger.componentdemo.runalone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.younger.componentdemo.R;


public class RunAloneMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_runalone);
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ARouter.getInstance().build("/runa/RunAloneDebug").navigation();
//                startActivity(new Intent(RunAloneMainActivity.this,RunAloneDebugActivity.class));
            }
        });

    }
}
