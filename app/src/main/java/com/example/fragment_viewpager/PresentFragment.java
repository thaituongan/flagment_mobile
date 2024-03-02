package com.example.fragment_viewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PresentFragment} factory method to
 * create an instance of this fragment.
 */
public class PresentFragment extends Fragment {

   public PresentFragment(){

   }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //ánh xạ đến view
        return inflater.inflate(R.layout.fragment_present_layout, container, false);
    }
}