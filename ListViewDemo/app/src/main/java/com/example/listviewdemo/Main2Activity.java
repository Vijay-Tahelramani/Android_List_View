package com.example.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView city,cityTemp,weatherInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        city = (TextView)findViewById(R.id.Info_cityName);
        weatherInfo = (TextView)findViewById(R.id.weatherInfo);
        cityTemp = (TextView)findViewById(R.id.CityTemp);

        city.setText(getIntent().getStringExtra("cityName"));
        weatherInfo.setText(getIntent().getStringExtra("weather_info"));
        cityTemp.setText(getIntent().getStringExtra("Temperature")+"°C");
    }
}
