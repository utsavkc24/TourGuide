package com.example.tourguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragAdapter(@NonNull FragmentManager fm, Context context){
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 0) return new AttractionFragment();
        else if (position == 1) return new FoodsAndDrinksFragment();
        else if (position == 2) return new HotelsFragment();
        else return new ShoppingFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return null;
    }
}