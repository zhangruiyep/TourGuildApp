package com.example.android.tourguildapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<TSInfo> {
    private int mColor;

    public InfoAdapter(Activity context, ArrayList<TSInfo> InfoList, int colorID) {
        super(context, 0, InfoList);
        mColor = colorID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        final TSInfo curInfo = getItem(position);

        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(curInfo.getmTitle());

        TextView detailTextView = listItemView.findViewById(R.id.detail_text_view);
        detailTextView.setText(curInfo.getmInfo());

        ImageView imageView = listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(curInfo.getmImgRes());

        LinearLayout itemLayout = listItemView.findViewById(R.id.item_layout);
        itemLayout.setBackgroundResource(mColor);

        return listItemView;
    }
}
