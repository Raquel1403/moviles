package com.example.botones;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

        Button boton1 = (Button) findViewById(R.id.button);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bt1 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(bt1);
            }
        });

        Button boton2 = (Button) findViewById(R.id.button2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bt2 = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(bt2);
            }
        });
    }


}