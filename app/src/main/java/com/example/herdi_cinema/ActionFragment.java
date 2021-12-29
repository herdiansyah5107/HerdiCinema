package com.example.herdi_cinema;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bitsandpizza.R;

public class ActionFragment extends Fragment{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView cinemaRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_action, container, false);
        String[] cinemaName = new String[Film.action.length];
        for (int i = 0; i < cinemaName.length; i++) {
            cinemaName[i] = Film.action[i].getName();
        }
        int[] cinemaImage = new int[Film.action.length];
        for (int i = 0; i < cinemaImage.length; i++) {
            cinemaImage[i] = Film.action[i].getImageResourceId();
        }
//        return inflater.inflate(R.layout.fragment_horor, container, false);

        CaptionedImageAdapter adapter = new CaptionedImageAdapter(cinemaName, cinemaImage);
        cinemaRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 4);
        cinemaRecycler.setLayoutManager(layoutManager);
        return cinemaRecycler;
    }
}