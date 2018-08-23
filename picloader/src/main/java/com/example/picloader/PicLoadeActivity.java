package com.example.picloader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bumptech.glide.Glide;

@Route(path = "/pic/PicLoadeActivity")
public class PicLoadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_loade);

        //https://ws1.sinaimg.cn/large/0065oQSqly1fuh5fsvlqcj30sg10onjk.jpg
        final String url ="http://ws1.sinaimg.cn/large/0065oQSqly1fuh5fsvlqcj30sg10onjk.jpg";
        final ImageView iv_image = findViewById(R.id.iv_image);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with(PicLoadeActivity.this).load(url).into(iv_image);
            }
        });


    }
}
