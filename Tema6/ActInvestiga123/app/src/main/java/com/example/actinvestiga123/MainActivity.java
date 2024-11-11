package com.example.actinvestiga123;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.miListView);

        // Lista de datos para el ListView
        ArrayList<DatosElemento> listaDatos = new ArrayList<>();
        listaDatos.add(new DatosElemento("España", "https://es.wikipedia.org/wiki/España", R.drawable.espana));
        listaDatos.add(new DatosElemento("Francia", "https://es.wikipedia.org/wiki/Francia", R.drawable.francia));
        listaDatos.add(new DatosElemento("Alemania", "https://es.wikipedia.org/wiki/Alemania", R.drawable.alemania));

        // Crear el adaptador personalizado
        MiAdaptador adaptador = new MiAdaptador(this, listaDatos);

        // Asignar el adaptador al ListView
        listView.setAdapter(adaptador);
    }
}