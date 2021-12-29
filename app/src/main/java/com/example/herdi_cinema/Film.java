package com.example.herdi_cinema;


import com.example.bitsandpizza.R;

public class Film{
    private String name;
    private int imageResourceId;

    public static  final Film[] horor = {
            new Film ("beranak dalam kubur", R.drawable.hor_beranak),
            new Film ("Ratu Buaya Putih", R.drawable.horor_buaya),
            new Film ("Malam Jumat Kliwon", R.drawable.horor_kliwon),
            new Film ("Malam Satu Suro", R.drawable.horor_satu),
    };
    public static  final Film [] action = {
            new Film ("Saraz", R.drawable.act_saraz),
            new Film ("Tarung Sarung", R.drawable.act_sarung),
            new Film ("srigal Terakhir", R.drawable.act_serigala),
            new Film ("Wiro Sableng", R.drawable.act_wirosableng),
    };
    public static  final Film [] scifi = {
            new Film ("Epen Cupen", R.drawable.sci_epen_cupen),
            new Film ("Mentalis", R.drawable.sci_mentalist),
            new Film ("Prefosionalish", R.drawable.sci_profesionals),
            new Film ("Semesta Mendukung", R.drawable.sci_semesta),
    };

    public static  final Film [] top = {
            new Film("Saraz", R.drawable.act_saraz),
            new Film("Ratu Buaya Putih", R.drawable.horor_buaya),
            new Film("Epen Cupen", R.drawable.sci_epen_cupen),
    };
    public Film(String beranak_dalam_kubur, int hor_beranak) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
