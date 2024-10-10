package com.example.moviles_act8;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alarma(View v) {
        startAlarm();
    }

    private void startAlarm() {
       /* Intent intent = new Intent(this, AlarmReceiver.class);
        PendingIntent miPending = PendingIntent.getActivity(this, 1, intent, miPending.FLAG_UPDATE_CURRENT);

        AlarmManager alarma = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarma.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (5 * 1000), miPending);*/

      // Definir el tiempo de espera para la alarma (5 segundos)
        long triggerAfter = 5000; // 5000 milisegundos = 5 segundos

        // Obtener el AlarmManager
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        // Intent para el BroadcastReceiver que manejará la alarma
        Intent intent = new Intent(this, AlarmReceiver.class);

        // PendingIntent para lanzar el BroadcastReceiver
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
        );

        // Programar la alarma
        if (alarmManager != null) {
            alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + triggerAfter, pendingIntent);
        }
    }
}
