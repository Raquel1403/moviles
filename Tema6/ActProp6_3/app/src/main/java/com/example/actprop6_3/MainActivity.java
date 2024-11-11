package com.example.actprop6_3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final String[] paises = new String[]{"España", "Francia", "Alemania", "Italia", "Portugal", "Países Bajos", "Suecia", "Noruega", "Grecia", "Dinamarca"};
    Spinner listado;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.mitextView);
        listado =findViewById(R.id.miSpinner);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, paises);
        listado.setAdapter(adaptador);

        listado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String seleccionado = paises[position];
                texto.setText("País seleccionado: " + seleccionado);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                texto.setText("");
            }
        });
    }
}