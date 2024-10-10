package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("EJEMPLO", "Estado onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("EJEMPLO", "Estado onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("EJEMPLO", "Estado onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("EJEMPLO", "Estado onPause");
       /* Intent ejemplo = new Intent(Intent.ACTION_VIEW);
        ejemplo.setData(Uri.parse("http://www.google.es"));
        startActivity(ejemplo);*/



    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("EJEMPLO", "Estado onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("EJEMPLO", "Estado onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("EJEMPLO", "Estado onDestroy");

    }
    public void pulsado(View view){
        Intent intentOnDestroy = new Intent(this, MainActivity2.class);
        startActivity(intentOnDestroy);
    }
}
