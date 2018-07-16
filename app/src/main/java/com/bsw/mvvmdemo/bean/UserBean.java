package com.bsw.mvvmdemo.bean;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import android.widget.Toast;

import com.bsw.mvvmdemo.BR;

/**
 * author bsw
 * date 2018/4/6
 */
public class UserBean extends BaseObservable {
    private Context context;
    private String username;
    private String nickname;
    private String age;

    public UserBean() {
    }

    public String getAge() {
        return age + "";
    }

    @Bindable
    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    public String getNickname() {
        return nickname;
    }

    @Bindable
    public void setNickname(String nickname) {
        this.nickname = nickname;
        notifyPropertyChanged(BR.nickname);
    }

    public String getUsername() {
        return username;
    }

    @Bindable
    public void setUsername(String username) {
        this.username = username;
        notifyPropertyChanged(BR.username);
    }

    public UserBean(Context context, String age, String nickname, String username) {
        this.age = age;
        this.context = context;
        this.nickname = nickname;
        this.username = username;
    }

    public void toast(View view) {
        notifyChange();
        Toast.makeText(context, "username = " + username + " ** nickname = " + nickname + " ** age = " + age, Toast.LENGTH_LONG).show();
    }
}