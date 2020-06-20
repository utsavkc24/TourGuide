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
public class FoodsAndDrinksFragment extends Fragment {

    public FoodsAndDrinksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list,container,false);
        List<Custom> list = new ArrayList<>();
        list.add(new Custom(R.string.bansi_vihar_resturant, R.string.bansi_vihar_resturant_description, R.string.bansi_vihar_resturant_location, R.string.bansi_vihar_resturant_timing, R.drawable.bansi_vihar_image));
        list.add(new Custom(R.string.biryani_mahal, R.string.biryani_mahal_description, R.string.bihar_museum_timing, R.string.bihar_museum_timing, R.drawable.biryani_mahal_image));
        list.add(new Custom(R.string.dominos, R.string.dominos_description, R.string.dominos_location, R.string.dominos_timing, R.drawable.dominos_image));
        list.add(new Custom(R.string.mainland_china, R.string.mainland_china_description, R.string.mainland_china_location, R.string.mainland_china_timing, R.drawable.mainland_china_image));
        list.add(new Custom(R.string.seventeen_degree, R.string.seventeen_degree_description, R.string.seventeen_degree_location, R.string.seventeen_degree_timing, R.drawable.degree_image));

        WordAdapter adapter = new WordAdapter(getActivity(), list);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
