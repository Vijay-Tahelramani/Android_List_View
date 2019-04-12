package com.example.listviewdemo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;

    //to store the animal images
    private final Integer[] imageIDarray;

    //to store the list of countries
    private final String[] nameArray;

    //to store the list of countries
    private final String[] infoArray;

    private final Integer[] tempArray;


    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam, Integer[] tempArrayParam){

        super(context,R.layout.weather_layout , nameArrayParam);
        this.context = context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
        this.tempArray = tempArrayParam;

    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowVieW = inflater.inflate(R.layout.weather_layout,null,true);
        TextView cityName = (TextView)rowVieW.findViewById(R.id.CityName);
        TextView wInfo = (TextView)rowVieW.findViewById(R.id.weatherInfo);
        ImageView cloudImage = (ImageView)rowVieW.findViewById(R.id.cloud);
        TextView temperature = (TextView)rowVieW.findViewById(R.id.temp);

        cityName.setText(nameArray[position]);
        wInfo.setText(infoArray[position]);
        temperature.setText(tempArray[position].toString());
        cloudImage.setImageResource(imageIDarray[position]);

        return rowVieW;
    }
}
