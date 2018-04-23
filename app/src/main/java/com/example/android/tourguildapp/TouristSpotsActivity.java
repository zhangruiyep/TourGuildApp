package com.example.android.tourguildapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TouristSpotsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArrayList<TSInfo> info = new ArrayList<TSInfo>();
        info.add(new TSInfo(R.drawable.bell_tower, "钟楼", "莲湖区东大街和西大街交汇处"));
        info.add(new TSInfo(R.drawable.gulou, "鼓楼","北院门74号"));


        //InfoAdapter itemsAdapter = new InfoAdapter(this, info, R.color.category_colors);
        InfoAdapter itemsAdapter = new InfoAdapter(this, info, R.color.colorPrimaryDark);
        ListView listView = (ListView) findViewById(R.id.info_list_view);
        //GridView listView = (GridView) findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);

    }
}
