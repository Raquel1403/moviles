package com.example.animacion;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.widget.TextView;

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

        // Obtener la referencia al TextView desde el layout
        TextView miTexto = findViewById(R.id.miTexto);

        AnimationSet animacion = new AnimationSet(true);
        AlphaAnimation aparicion = new AlphaAnimation(0,1);
        aparicion.setDuration(3000);
        animacion.addAnimation(aparicion);
        animacion.setRepeatMode(AnimationSet.RESTART);
        animacion.setRepeatCount(20);
        miTexto.startAnimation(animacion);
    }
}