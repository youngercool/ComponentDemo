package com.example.arouter.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.arouter.R;


/**
 * https://m.aliyun.com/test/activity1?name=老王&age=23&boy=true&high=180
 */
@Route(path = "/test/activity2", name = "测试用 Activity")
public class Test2Activity extends AppCompatActivity {

    @Autowired(desc = "姓名")
    String name = "jack";

    @Autowired
    int age = 10;

    @Autowired
    int height = 175;

    @Autowired(name = "boy", required = true)
    boolean girl;

    @Autowired
    char ch = 'A';

    @Autowired
    float fl = 12.00f;

    @Autowired
    double dou = 12.01d;


    private long high;

    @Autowired
    String url;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        ARouter.getInstance().inject(this);

        // No more getter ...
        // name = getIntent().getStringExtra("name");
        // age = getIntent().getIntExtra("age", 0);
        // girl = getIntent().getBooleanExtra("girl", false);
        // high = getIntent().getLongExtra("high", 0);
        // url = getIntent().getStringExtra("url");

        String params = String.format(
                "name=%s,\n age=%s, \n height=%s,\n girl=%s",
                name,
                age,
                height,
                girl
        );

        ((TextView) findViewById(R.id.test)).setText("I am " + Test2Activity.class.getName());
        ((TextView) findViewById(R.id.test2)).setText(params);
    }
}
