package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list,container,false);
        List<Custom> list = new ArrayList<>();
        list.add(new Custom(R.string.buddha_smriti_park, R.string.buddha_smriti_park_description, R.string.buddha_smriti_park_location, R.string.buddha_smriti_park_timing, R.drawable.buddha_smriti_park_image));
        list.add(new Custom(R.string.gurudwara, R.string.gurudwara_description, R.string.gurudwara_description, R.string.gurudwara_timing, R.drawable.gurudwara_image));
        list.add(new Custom(R.string.patna_zoo, R.string.patna_zoo_description, R.string.patna_zoo_location, R.string.patna_bridge_timing, R.drawable.gurudwara_image));
        list.add(new Custom(R.string.bihar_museum, R.string.bihar_museum_description, R.string.bihar_museum_location, R.string.bihar_museum_timing, R.drawable.bihar_museum));
        list.add(new Custom(R.string.patna_bridge, R.string.patna_bridge_description, R.string.patna_bridge_location, R.string.patna_bridge_timing, R.drawable.bridge_image));

        WordAdapter adapter = new WordAdapter(getActivity(), list);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
