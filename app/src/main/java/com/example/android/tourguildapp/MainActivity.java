package com.example.android.tourguildapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView foodTextView = (TextView)findViewById(R.id.food_category_text_view);
        foodTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cateIntent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(cateIntent);
            }
        });

        TextView hotelTextView = (TextView)findViewById(R.id.hotel_category_text_view);
        hotelTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cateIntent = new Intent(MainActivity.this, HotelActivity.class);
                startActivity(cateIntent);
            }
        });

        TextView TouristSpotsTextView = (TextView)findViewById(R.id.tourist_spots_category_text_view);
        TouristSpotsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cateIntent = new Intent(MainActivity.this, TouristSpotsActivity.class);
                startActivity(cateIntent);
            }
        });

        TextView TrafficTextView = (TextView)findViewById(R.id.traffic_category_text_view);
        TrafficTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cateIntent = new Intent(MainActivity.this, TrafficActivity.class);
                startActivity(cateIntent);
            }
        });
    }
}
