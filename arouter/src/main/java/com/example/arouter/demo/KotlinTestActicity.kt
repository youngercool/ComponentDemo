package com.example.arouter.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.arouter.R
import kotlinx.android.synthetic.main.activity_kotlin_test.*

@Route(path = "/kotTest/kot")
class KotlinTestActicity : AppCompatActivity() {
    @Autowired
    @JvmField var name: String? = null
    @Autowired
    @JvmField var age: Int? = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_test)

        content.text = "name = $name, age = $age"
    }

}