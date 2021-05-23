package com.example.mademyday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        getSupportActionBar().hide();

        ImageButton clean = findViewById(R.id.imageButton);

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(dashboard.this, Cleaningactivity.class);
                startActivity(homeIntent);
            }
        });

        ImageButton baby = findViewById(R.id.imageButton2);

        baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(dashboard.this, Cleaningactivity.class);
                startActivity(homeIntent);
            }
        });
        ImageButton laundry = findViewById(R.id.imageButton3);

        laundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(dashboard.this, Cleaningactivity.class);
                startActivity(homeIntent);
            }
        });
        ImageButton cooking = findViewById(R.id.imageButton4);

        cooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(dashboard.this, Cleaningactivity.class);
                startActivity(homeIntent);
            }
        });
    }
}