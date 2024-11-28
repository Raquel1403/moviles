package com.example.actprop7_4_1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Toca uno de los botones");
                builder.setTitle("ACTIVIDAD DEL DIÁLOGO");
                builder.setIcon(R.mipmap.ic_launcher);

                builder.setPositiveButton("POSITIVO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "TOCADO BOTÓN POSITIVO", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("NEGATIVO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "TOCADO BOTÓN NEGATIVO", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNeutralButton("NEUTRAL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "TOCADO BOTÓN NEUTRAL", Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog dialogo = builder.create();
                dialogo.show();
            }
        });



    }
}