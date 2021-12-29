package com.example.herdi_cinema;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bitsandpizza.R;

public class CaptionedImageAdapter extends
        RecyclerView.Adapter<CaptionedImageAdapter.ViewHolder>{

    private String[] cinemaName;
    private int[] cinemaImage;

    public CaptionedImageAdapter(String[] cinemaName, int[] cinemaImage) {
        this.cinemaName = cinemaName;
        this.cinemaImage = cinemaImage;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_captioned_image, parent, false);
        return new ViewHolder(cv);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    CardView cardView = holder.cardView;
    ImageView imageView = (ImageView)cardView.findViewById(R.id.info_image);
        Drawable drawable =
                ContextCompat.getDrawable(cardView.getContext(), cinemaImage[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(cinemaName[position]);
        TextView textView =(TextView)cardView.findViewById(R.id.info_text);
        textView.setText(cinemaName[position]);
    }
    @Override
    public int getItemCount() {
        return cinemaName.length;
    }
}
