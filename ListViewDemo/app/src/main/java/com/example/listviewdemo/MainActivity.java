package com.example.listviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] cities = {"Montreal","Quebec City","Sherbrooke","Laval","Gaspe","Brossard","Saint-Georges","Sagueay","Trois-Rivieres","Saint-Raymond"};
    String[] cityWeather = {"Snowing","Wind","Sunny","Raining","Cloudy","Fog","Snowing and Rain","Thunderstorms","Thunderstroms and Rain","Hail"};
    Integer[] ImageWeather = {R.drawable.snowy,R.drawable.windy,R.drawable.sunny,R.drawable.pour,R.drawable.cloudy,R.drawable.fog,R.drawable.snowrain,R.drawable.light,R.drawable.lightrain,R.drawable.hail};
    Integer[] cityTemp = {-13,-10,-5,0,-8,-22,-16,-4,-9,-25};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list_view);
        listView.setOverScrollMode(View.OVER_SCROLL_NEVER);
        CustomListAdapter weather = new CustomListAdapter(this,cities,cityWeather,ImageWeather,cityTemp);
        listView.setAdapter(weather);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("cityName",cities[position]);
                intent.putExtra("Temperature",cityTemp[position].toString());
                intent.putExtra("weather_info",cityWeather[position]);
                startActivity(intent);
            }
        });
    }
}
