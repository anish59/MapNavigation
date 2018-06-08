package com.example.user.mapnavigation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wang.avi.AVLoadingIndicatorView;

public class MainActivity extends AppCompatActivity {

    private com.example.user.mapnavigation.custom.CricleProgressBarCustom progressCircle;
    private AVLoadingIndicatorView indicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.indicator = (AVLoadingIndicatorView) findViewById(R.id.indicator);
        indicator.show();


    }
}
