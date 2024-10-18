package com.example.botones;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener { // Implementa OnClickListener

    private TextView textView; // Declarar textView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Inicializar textView
        textView = findViewById(R.id.textView);

        Button boton3 = findViewById(R.id.button3);
        boton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Cambiar el texto y color del TextView al pulsar el botón
        textView.setText("BOTÓN PULSADO");
        textView.setTextColor(Color.RED);
    }
}
