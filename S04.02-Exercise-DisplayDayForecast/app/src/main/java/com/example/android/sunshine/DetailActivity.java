package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mWeatherdetailsTv;
    private  String mForeCast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent intentFromMainActivity=getIntent();

        mWeatherdetailsTv=(TextView)findViewById(R.id.tv_display_weather_details);

        if(intentFromMainActivity !=null){
            if(intentFromMainActivity.hasExtra(Intent.EXTRA_TEXT)){
                mForeCast=intentFromMainActivity.getStringExtra(Intent.EXTRA_TEXT);
                mWeatherdetailsTv.setText(mForeCast);
            }
        }



        // DONE (2) Display the weather forecast that was passed from MainActivity
    }
}