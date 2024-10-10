package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i("EJEMPLO", "Estado onPause");

        Intent intentOnDestroy = new Intent(this, MainActivity.class);
        startActivity(intentOnDestroy);
    }
}
