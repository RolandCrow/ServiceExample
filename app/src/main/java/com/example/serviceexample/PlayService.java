package com.example.serviceexample;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;
import androidx.annotation.Nullable;

public class PlayService extends Service { // сервисы не связаны с графическим интерфейсом, но связаны с активностями через интенты


    private MediaPlayer mPlayer;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Служба запущена", Toast.LENGTH_SHORT).show();
        mPlayer = MediaPlayer.create(this, R.raw.sample); // присоединяем песню
        mPlayer.setLooping(false);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Служба запущена", Toast.LENGTH_SHORT).show();
        mPlayer.start(); // запускаем песню
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Служба остановлена", Toast.LENGTH_SHORT).show();
        mPlayer.stop(); // остановка песни
    }
}
