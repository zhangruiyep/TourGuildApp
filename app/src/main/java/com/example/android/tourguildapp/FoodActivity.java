package com.example.android.tourguildapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArrayList<TSInfo> info = new ArrayList<TSInfo>();
        info.add(new TSInfo(R.drawable.yangroupaomo, "羊肉泡馍", "制作原料主要有羊肉、葱末、粉丝、糖蒜等，它肉烂汤浓，食后回味无穷。"));
        info.add(new TSInfo(R.drawable.roujiamo, "肉夹馍","腊汁肉夹在烧饼中吃,民间称其为“肉夹馍”。"));


        //InfoAdapter itemsAdapter = new InfoAdapter(this, info, R.color.category_colors);
        InfoAdapter itemsAdapter = new InfoAdapter(this, info, R.color.colorFood);
        ListView listView = (ListView) findViewById(R.id.info_list_view);
        //GridView listView = (GridView) findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);


    }
}
