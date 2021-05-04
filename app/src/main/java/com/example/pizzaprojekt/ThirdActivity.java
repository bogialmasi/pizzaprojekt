package com.example.pizzaprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        EditText irsz = findViewById(R.id.irsz);
        EditText telepules = findViewById(R.id.telepules);
        EditText hazszam = findViewById(R.id.hazszam);
        Button megrendeles = findViewById(R.id.megrendeles);
        TextView pizzam1 = findViewById(R.id.pizzam1);
        TextView pizzam2 = findViewById(R.id.pizzam2);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            pizzam1.setText(extras.getString("atadpizza"));
            pizzam2.setText(extras.getString("pizzameret"));
        }

        megrendeles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ThirdActivity.this, FourthActivity.class);
                i.putExtra("irsz", irsz.getText().toString());
                i.putExtra("telepules", telepules.getText().toString());
                i.putExtra("szam", hazszam.getText().toString());
                i.putExtra("atadpizza", pizzam1.getText().toString());
                i.putExtra("pizzameret", pizzam2.getText().toString());

                startActivity(i);
            }

        });
    }
}