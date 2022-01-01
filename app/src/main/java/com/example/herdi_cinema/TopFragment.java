package com.example.herdi_cinema;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TopFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView cinemaRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_top, container, false);
        String[] captions = new String[Film.top.length];
        for (int i = 0; i < captions.length; i++) {
            captions[i] = Film.top[i].getName();
        }
        int[] ImageIds = new int[Film.top.length];
        for (int i = 0; i < ImageIds.length; i++) {
            ImageIds[i] = Film.top[i].getImageResourceId();
        }
//        return inflater.inflate(R.layout.fragment_horor, container, false);

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ImageIds);
        cinemaRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 1);
        cinemaRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
        public void onClick(int position) {
            Intent intent = new Intent(getActivity(), DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_FILMID, position+1);
            getActivity().startActivity(intent);
        }
    });
        return cinemaRecycler;
    }
}