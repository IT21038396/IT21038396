package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button annual,monthly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        annual = findViewById(R.id.annualBtn);
        monthly = findViewById(R.id.monthlyBtn);

        annual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent annualPage = new Intent(MainActivity.this,AnnualPlanActivity.class);
                startActivity(annualPage);
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }
        });

        monthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent monthlyPage = new Intent(MainActivity.this,monthlyPlanPage.class);
                startActivity(monthlyPage);
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }
        });

    }
}