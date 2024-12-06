package com.example.actprop8_2;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager paginador = findViewById(R.id.contenedor2);
        final TabLayout tabs = (TabLayout) findViewById(R.id.TabLayout);

        tabs.addTab(tabs.newTab().setText("PRIMERO").setIcon(android.R.drawable.ic_media_play));
        tabs.addTab(tabs.newTab().setText("SEGUNDO").setIcon(android.R.drawable.ic_media_pause));
        tabs.addTab(tabs.newTab().setText("TERCERO").setIcon(android.R.drawable.ic_media_previous));

        Adaptador adaptador = new Adaptador(getSupportFragmentManager(), tabs.getTabCount());
        paginador.setAdapter(adaptador);

        paginador.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                paginador.setCurrentItem(tab.getPosition());


//                Fragment fragmento = null;
//                if (tab.getPosition() == 0){
//                    fragmento = new Primero();
//                } else if (tab.getPosition() == 1){
//                    fragmento = new Segundo();
//                } else if (tab.getPosition() == 2){
//                    fragmento = new Tercero();
//                }
//
//                // Realizar la transacción para reemplazar el fragmento
//                if (fragmento!= null){
//                    FragmentManager fm = getSupportFragmentManager();
//                    FragmentTransaction ft = fm.beginTransaction();
//                    ft.replace(R.id.contenedor, fragmento);
//                    ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//                    // Agregar esta línea para finalizar la transacción
//                    ft.commit();
//                }



            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}