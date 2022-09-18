package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class myPlansPage extends AppCompatActivity {

    ImageButton backBtn,plans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_plans_page);

        backBtn = findViewById(R.id.myPlansBackButton);

        backBtn.setOnClickListener(view ->{
            Intent planBackBtn = new Intent(myPlansPage.this,AnnualPlanActivity.class);
            startActivity(planBackBtn);
            overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
        });


    }
}