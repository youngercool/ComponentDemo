package com.example.arouter;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/arou/ArouterActivity")
public class ArouterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arouter);


        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance()
                        .build("/test/activity1")
                        .navigation();
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance()
                        .build("/kotTest/kot")
                        .withString("name", "老王")
                        .withInt("age", 23)
                        .navigation();
//                startActivity(new Intent(ArouterActivity.this, KotlinTestActicity.class));
            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance()
                        .build("/test/activity1")
                        .withString("key1","younger")
                        .navigation();
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance()
                        .build("/test/activity1")
                        .navigation(ArouterActivity.this,666);
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = (Fragment) ARouter.getInstance().build("/test/fragment").navigation();
                Toast.makeText(ArouterActivity.this, "找到Fragment:" + fragment.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance()
                        .build("/test/webview")
                        .withString("url", "file:///android_asset/schame-test.html")
                        .navigation();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==666 && resultCode==999){
            Toast.makeText(this, "结果回来啦 666!!!", Toast.LENGTH_LONG).show();
        }
    }
}
