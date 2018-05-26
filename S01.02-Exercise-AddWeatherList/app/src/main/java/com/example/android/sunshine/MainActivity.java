/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.sunshine.data.SunshinePreferences;
import com.example.android.sunshine.utilities.NetworkUtils;
import com.example.android.sunshine.utilities.OpenWeatherJsonUtils;
import com.example.android.sunshine.utilities.SunshineWeatherUtils;

public class MainActivity extends AppCompatActivity {

    private TextView mWeatherDisplayTextView;
    private String[] fakeWeatherData;

    // TODO (1) Create a field to store the weather display TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);
        mWeatherDisplayTextView = (TextView) findViewById(R.id.tv_weather_data);


        fakeWeatherData = new String[]{
                "Today, May 26 - Clear - 17°C / 15°C",
                "Tomorrow - Cloudy - 19°C / 15°C",
                "Sunday - Rainy- 30°C / 11°C",
                "Monday - Thunderstorms - 21°C / 9°C",
                "Tuesday - Thunderstorms - 16°C / 7°C",
                "wednesday - Rainy - 16°C / 8°C",
                "thursday - Partly Cloudy - 15°C / 10°C",
                "Fri, May 27 - Meatballs - 16°C / 18°C",
                "Sat, May 28 - Cloudy - 19°C / 15°C",
                "Sun, May 29 - Stormy - 30°C / 11°C",
                "Mon, May 30 - Hurricane - 21°C / 9°C",
                "Tue, May 31 - Meteors - 16°C / 7°C",
                "Wed, June 01 - Apocalypse - 16°C / 8°C",
                "Thu, June 02 - Post Apocalypse - 15°C / 10°C",
        };

        for (int i = 0; i < fakeWeatherData.length; i++) {
            mWeatherDisplayTextView.append(fakeWeatherData[i] + "\n" + "\n");

            // TOD0 (2) Use findViewById to get a reference to the weather display TextView

            // T0DO (3) Create an array of Strings that contain fake weather data

            // T0DO (4) Append each String from the fake weather data array to the TextView
        }
    }
}