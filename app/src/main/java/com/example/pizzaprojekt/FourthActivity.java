package com.example.pizzaprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        TextView szoveg = findViewById(R.id.szoveg);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            szoveg.setText(extras.getString("atadpizza") + "\n" + (extras.getString("pizzameret")) + "\n" + (extras.getString("irsz")) + "\n" + (extras.getString("telepules")) + "\n" + extras.getString("szam"));
        }

    }
}