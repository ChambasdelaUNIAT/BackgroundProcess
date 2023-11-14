package com.example.backgroundprocess;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startTaskBackground(View view){
        Intent intent = new Intent(this, myBackgroundProcess.class);
        intent.setAction("BackgroundProcess");

        //Colocando un pending intent para pasar la actividad independientemente de que
        //esta app ya no esté en ejecución

        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);

        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,0,100,pendingIntent);

        finish();
    }
}