package com.example.pizzaprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView margherita = findViewById(R.id.margherita);
        ImageView margherita_img = findViewById(R.id.margherita_img);

        TextView sonkas = findViewById(R.id.sonkas);
        ImageView sonkas_img = findViewById(R.id.sonkas_img);

        TextView hawaii = findViewById(R.id.hawaii);
        ImageView hawaii_img = findViewById(R.id.hawaii_img);

        TextView gombas = findViewById(R.id.gombas);
        ImageView gombas_img = findViewById(R.id.gombas_img);

        margherita_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atad = new Intent(MainActivity.this, SecondActivity.class);
                atad.putExtra("atadpizza", margherita.getText().toString());
                startActivity(atad);
            }
        });

        sonkas_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atad = new Intent(MainActivity.this, SecondActivity.class);
                atad.putExtra("atadpizza", sonkas.getText().toString());
                startActivity(atad);
            }
        });

        hawaii_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atad = new Intent(MainActivity.this, SecondActivity.class);
                atad.putExtra("atadpizza", hawaii.getText().toString());
                startActivity(atad);
            }
        });

        gombas_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atad = new Intent(MainActivity.this, SecondActivity.class);
                atad.putExtra("atadpizza", gombas.getText().toString());
                startActivity(atad);
            }
        });
    }
}