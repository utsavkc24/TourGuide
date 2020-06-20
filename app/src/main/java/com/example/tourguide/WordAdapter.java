package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Custom> {


        public WordAdapter(@NonNull Context context, @NonNull List<Custom> locations) {
            super(context, 0, locations);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            // check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if (listItemView == null) {

                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            }

            // get the object located at this location
            Custom currentLocation = getItem(position);

            // finding the titleTextView in location_item and setting value to it.
            TextView titleTextView = listItemView.findViewById(R.id.titleTextView);
            titleTextView.setText(currentLocation.getmTitle());

            TextView descriptionTextView = listItemView.findViewById(R.id.descriptionTextView);
            descriptionTextView.setText(currentLocation.getmDetail());

            TextView addressTextView = listItemView.findViewById(R.id.addressTextView);
            addressTextView.setText(currentLocation.getmAddress());

            TextView timeTextView = listItemView.findViewById(R.id.timeTextView);
            timeTextView.setText(currentLocation.getmTime());

            ImageView cardImage = listItemView.findViewById(R.id.photoImageView);
            cardImage.setImageResource(currentLocation.getmImageId());

            return listItemView;
        }
    }
