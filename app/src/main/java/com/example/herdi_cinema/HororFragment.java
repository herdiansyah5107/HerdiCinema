package com.example.herdi_cinema;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HororFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView cinemaRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_horor, container, false);
        String[] captions = new String[Film.horor.length];
        for (int i = 0; i < captions.length; i++) {
            captions[i] = Film.horor[i].getName();
        }
        int[] ImageIds = new int[Film.horor.length];
        for (int i = 0; i < ImageIds.length; i++) {
            ImageIds[i] = Film.horor[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ImageIds);
        cinemaRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        cinemaRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_FILMID, position+Film.top.length+1);
                getActivity().startActivity(intent);
                System.out.println("position horor"+position);
            }
        });
        return cinemaRecycler;
    }
}