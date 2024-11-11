package com.example.actprop6_2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final String[] paises = new String[]{"España", "Francia", "Alemania", "Italia", "Portugal", "Países Bajos", "Suecia", "Noruega", "Grecia", "Dinamarca"};
    GridView listado;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.mitextView);
        listado =(GridView) findViewById(R.id.miLista);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, paises);
        listado.setAdapter(adaptador);

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String seleccionado = paises[position];
                texto.setText("País seleccionado: " + seleccionado);
            }
        });
    }
}