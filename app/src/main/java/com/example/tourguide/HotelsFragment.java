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
 *
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list,container,false);
        List<Custom> list = new ArrayList<>();
        list.add(new Custom(R.string.panache, R.string.panache_description, R.string.panache_location, R.string.panache_timing, R.drawable.panche_hotel_image));
        list.add(new Custom(R.string.lemon_tree, R.string.lemon_tree_description, R.string.lemon_tree_location, R.string.lemon_tree_timing, R.drawable.lemon_tree_hotel_image));
        list.add(new Custom(R.string.maurya, R.string.maurya_description, R.string.maurya_location, R.string.maurya_timing, R.drawable.hotel_maurya_image));
        list.add(new Custom(R.string.patliputra, R.string.patliputra_description, R.string.patliputra_location, R.string.patliputra_timing, R.drawable.patliputra_hotel_image));
        list.add(new Custom(R.string.buddha_heritage, R.string.buddha_heritage_description, R.string.buddha_heritage_location, R.string.buddha_heritage_timing, R.drawable.buddha_hotel_image));

        WordAdapter adapter = new WordAdapter(getActivity(), list);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
