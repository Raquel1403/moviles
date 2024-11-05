package com.example.raquel_prueba2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.button);
        b1.setOnClickListener(this);
        Button b2 = findViewById(R.id.button2);
        b2.setOnClickListener(this);
        Button b3 = findViewById(R.id.button3);
        b3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            intent = new Intent(this, Pantalla2.class);
            startActivity(intent);

        } else if (view.getId() == R.id.button2) {
            intent = new Intent(this, Pantalla3.class);
            startActivity(intent);
        } else if (view.getId() == R.id.button3) {
            intent = new Intent(this, Pantalla4.class);
            startActivity(intent);
        }

    }
}