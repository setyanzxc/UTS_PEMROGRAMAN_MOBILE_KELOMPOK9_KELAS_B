package com.kelompok9.versiandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AndroAdapter extends ArrayAdapter<Andro> {
    private ArrayList<Andro> androList;

    public AndroAdapter(@NonNull Context context, int resource, ArrayList<Andro> androList) {
        super(context, resource, androList);
        this.androList = androList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int phraseIndex = position;
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,
                    parent, false);
        }

        ImageView androImage = convertView.findViewById(R.id.andro_imageview);
        TextView titleTextView = convertView.findViewById(R.id.title_textview);
        TextView dateTextView = convertView.findViewById(R.id.date_textview);

        androImage.setImageResource(androList.get(position).getAndroImageId());
        titleTextView.setText(androList.get(position).getAndroTitle());
        dateTextView.setText(androList.get(position).getAndroDate());

        return convertView;
    }
}
