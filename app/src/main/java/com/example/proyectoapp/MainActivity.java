package com.example.proyectoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void nex_info(android.view.View view){
        Intent i=new Intent(this, formulario.class);
        startActivity(i);

    }
    public void nex_ingresar(android.view.View view){
        Intent i=new Intent(this, menu.class);
        startActivity(i);

    }


}



