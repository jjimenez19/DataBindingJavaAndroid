package com.example.databindingjavaandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingjavaandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //binding
    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mBinding.setLastName("Jimenez Piqueras");
        mBinding.setName("José Manuel");
    }
}
