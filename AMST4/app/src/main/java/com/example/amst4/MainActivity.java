package com.example.amst4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapa(View view) {
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
    public void irVideoYoutube(View view) {
        Intent intent = new Intent(this,youtubeActivity.class);
        startActivity(intent);
    }
    public void grafica(View view) {
        Intent intent = new Intent(this, mostrarGrafica.class);
        startActivity(intent);
    }
}