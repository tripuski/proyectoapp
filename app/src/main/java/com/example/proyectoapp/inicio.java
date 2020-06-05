package com.example.proyectoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        new Handler() .postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(inicio.this, MainActivity.class);
                startActivity(i);

            }
        },3000);
    }
}
