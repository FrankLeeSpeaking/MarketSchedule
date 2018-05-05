package com.example.allaccess.marketschedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class Page2 extends AppCompatActivity {

//-------- This is a simple two option selection page
//----- Will probably remove this page
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);


        //*****************************************************



        final Button committed = findViewById(R.id.btnCommitted);
        final Button potential = findViewById(R.id.btnPotential);

        committed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Scheduled.class));

            }
        });

        potential.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Scheduled.class));

            }
        });
    }
}
