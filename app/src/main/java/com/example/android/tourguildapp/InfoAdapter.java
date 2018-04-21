package com.example.android.tourguildapp;

import android.app.Activity;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<TSInfo> {

    public InfoAdapter(Activity context, ArrayList<TSInfo> InfoList) {
        super(context, 0, InfoList);
    }
}
