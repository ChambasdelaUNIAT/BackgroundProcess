package com.example.backgroundprocess;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.SystemClock;
import android.widget.Toast;

public class myBackgroundProcess extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Ringtone ringtone = RingtoneManager.getRingtone(context, RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE));

        Toast.makeText(context, "Suena el celular segundo plano", Toast.LENGTH_LONG).show();

        ringtone.play();

        SystemClock.sleep(1500);

        ringtone.stop();

    }
}
