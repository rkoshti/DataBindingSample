package com.rajesh.binding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.rajesh.binding.Model.User;
import com.rajesh.binding.databinding.LoginScreenBinding;


public class DataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        LoginScreenBinding binding = DataBindingUtil.setContentView(this,R.layout.login_screen);
        User user = new User();
        user.setDisplayName("Rajesh Koshti");
        user.setAge(23);
        binding.setUserModel(user);


    }
}
