package com.example.autocompletar;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] opciones = {"Opción 1", "Opción 2", "Opción 3", "Opción 4", "Opción 5"};
        AutoCompleteTextView textoLeido = (AutoCompleteTextView) findViewById(R.id.miTexto);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, opciones);
        textoLeido.setAdapter(adaptador);
    }
}