package com.example.serviceexample;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnStart = findViewById(R.id.button_start);
        final Button btnStop = findViewById(R.id.button_stop); // присоединяем кнопки

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // включаем сервис при нажатии
                // явный вызов сервиса
                startService(new Intent(MainActivity.this, PlayService.class));
            }
        });


        btnStop.setOnClickListener(new View.OnClickListener() { // оставновка сервиса при нажатии на кнопку
            @Override
            public void onClick(View view) {
                startService(new Intent(MainActivity.this, PlayService.class));

            }
        });

    }
}