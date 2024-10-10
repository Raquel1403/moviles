package com.example.moviles_act8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // Código que se ejecuta cuando se dispara la alarma
        Toast.makeText(context, "¡Alarma disparada!", Toast.LENGTH_SHORT).show();
    }
}