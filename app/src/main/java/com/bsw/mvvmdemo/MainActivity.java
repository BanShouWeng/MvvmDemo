package com.bsw.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bsw.mvvmdemo.bean.UserBean;
import com.bsw.mvvmdemo.databinding.ActivityMainBinding;

/**
 * author bsw
 * date 2018/4/6
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserBean user = new UserBean(getApplicationContext(),"34","张三","zhangsan");
        activityMainBinding.setUser(user);
    }
}
