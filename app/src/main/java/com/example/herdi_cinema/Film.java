package com.example.herdi_cinema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film{
    private String name;
    private int imageResourceId;

    public static  final Film[] horor = {
            new Film ("beranak dalam kubur", R.drawable.hor_beranak),
            new Film ("Ratu Buaya Putih", R.drawable.horor_buaya),
            new Film ("Malam Jumat Kliwon", R.drawable.horor_kliwon),
            new Film ("Malam Satu Suro", R.drawable.horor_satu),
    };
    public static  final Film [] adventure = {
            new Film ("Petualangan Sherina", R.drawable.petualanganserina),
            new Film ("Zathura", R.drawable.zathura),
            new Film ("The Lord of the Rings", R.drawable.lordofthering),
            new Film ("Jumanji", R.drawable.jumanji),};
    public static  final Film [] scifi = {
            new Film ("Epen Cupen", R.drawable.sci_epen_cupen),
            new Film ("Mentalis", R.drawable.sci_mentalist),
            new Film ("Prefosionalish", R.drawable.sci_profesionals),
            new Film ("Semesta Mendukung", R.drawable.sci_semesta),};

    public static  final Film [] top = {
            new Film ("Petualangan Serina", R.drawable.petualanganserina),
            new Film("Ratu Buaya Putih", R.drawable.horor_buaya),
            new Film("Epen Cupen", R.drawable.sci_epen_cupen),
            new Film ("Mentalis", R.drawable.sci_mentalist),
            new Film ("Prefosionalish", R.drawable.sci_profesionals),
            new Film ("Semesta Mendukung", R.drawable.sci_semesta),
            new Film ("Zathura", R.drawable.zathura),
            new Film ("The Lord of the Rings", R.drawable.lordofthering),
            new Film ("Jumanji", R.drawable.jumanji),
    };

    }


