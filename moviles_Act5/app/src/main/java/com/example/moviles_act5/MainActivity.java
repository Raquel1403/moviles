package com.example.moviles_act5;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirCamara(){
        Intent camara = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(camara);
    }
}