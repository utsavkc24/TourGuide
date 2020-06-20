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
        list.add(new Custom(R.string.pnm_mall, R.string.pnm_mall_description, R.string.pnm_mall_location, R.string.pnm_mall_timing, R.drawable.pnm_mall_image));
        list.add(new Custom(R.string.patna_central_mall, R.string.patna_central_mall_description, R.string.patna_central_mall_location, R.string.patna_central_mall_timing, R.drawable.patna_central_mall_shopping));
        list.add(new Custom(R.string.pantaloons, R.string.pantaloons_description, R.string.pantaloons_location, R.string.pantaloons_timing, R.drawable.pantaloos_shopping));
        list.add(new Custom(R.string.patna_one_mall, R.string.patna_one_mall_description, R.string.patna_one_mall_location, R.string.patna_one_mall_timing, R.drawable.one_mall_shopping));

        WordAdapter adapter = new WordAdapter(getActivity(), list);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
