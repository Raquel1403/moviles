package com.example.actprop8_2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Adaptador extends FragmentStatePagerAdapter {
    int numTab;

    public Adaptador(@NonNull FragmentManager fm, int numTab) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.numTab = numTab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new Primero();
        } else if (position == 1){
            return new Segundo();
        } else if (position == 2){
            return new Tercero();
        } else {
            throw new IllegalArgumentException("Posición no válida" + position);
        }

    }

    @Override
    public int getCount() {
        return numTab;
    }
}
