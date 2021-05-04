package com.example.pizzaprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    int currentItem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView valasszon = findViewById(R.id.valasszon);
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);
        TextView pizzam1 = findViewById(R.id.pizzam1);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            pizzam1.setText(extras.getString("atadpizza"));
        }
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (currentItem == position) {
                    return;
                } else {
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    String pizzameret = parent.getItemAtPosition(position).toString();
                    intent.putExtra("pizzameret", pizzameret);
                    intent.putExtra("atadpizza", pizzam1.getText().toString());
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}