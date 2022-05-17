package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabcount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new HomeFragment();
            case 1:
                return new SportFragment();
            case 2:
                return new TechFragment();
            case 3:
                return new ScienceFragment();


            default:
                return null;



        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
