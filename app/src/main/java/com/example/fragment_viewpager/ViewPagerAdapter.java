package com.example.fragment_viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.fragment_viewpager.HomeFlatment;
import com.example.fragment_viewpager.PresentFragment;
import com.example.fragment_viewpager.TransferFragment;
import com.example.fragment_viewpager.WorldFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFlatment();
            case 1:
                return new PresentFragment();
            case 2:
                return new TransferFragment();
            case 3:
                return new WorldFragment();

            default: return new HomeFlatment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}
