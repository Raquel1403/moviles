package com.example.actprop6_1_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PaisNuevo extends AppCompatActivity {

    private EditText campoPais;
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pais_nuevo);

        campoPais = findViewById(R.id.paisTexto);

        enviar = findViewById(R.id.botonPais);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nuevoPais = campoPais.getText().toString();

                Intent resultado = new Intent();
                resultado.putExtra("nuevoPais", nuevoPais);
                setResult(RESULT_OK, resultado);

                finish();
            }
        });

    }
}