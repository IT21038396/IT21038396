package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

public class AnnualPlanActivity extends AppCompatActivity {

    ImageButton back;
    TextView price;
    Button purchaseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annual_plan);


        back = findViewById(R.id.myPlansBackButton);

        back.setOnClickListener(view -> {
            Intent backBtn = new Intent(AnnualPlanActivity.this,MainActivity.class);
            startActivity(backBtn);
            overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
        });

        purchaseBtn = findViewById(R.id.months3PurchaseBtn);
        price = findViewById(R.id.price3MonthsPlan);

        Switch diet = findViewById(R.id.annualPlanSwitch1);
        Switch trainer = findViewById(R.id.switch2);

        diet.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                Integer dietFee = 10;
                Integer trainerFee = 20;
                Integer normalFee = 99;
                String finalPrice;


                if(trainer.isChecked() && !diet.isChecked()){
                    finalPrice = String.valueOf(normalFee + trainerFee);
                    price.setText(finalPrice + " $");
                }
                else if(diet.isChecked() && !trainer.isChecked()){
                    finalPrice = String.valueOf(normalFee + dietFee);
                    price.setText(finalPrice + " $");
                }
                else if(trainer.isChecked() && diet.isChecked()){
                    finalPrice = String.valueOf(normalFee + trainerFee + dietFee);
                    price.setText(finalPrice + " $");
                }
                else if(!diet.isChecked() && !trainer.isChecked()){
                    finalPrice = String.valueOf(normalFee);
                    price.setText(finalPrice + " $");
                }
                else{
                    price.setText(String.valueOf(normalFee) + " $");
                }
            }
        });

        purchaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myPlansPage = new Intent(AnnualPlanActivity.this, com.example.application.myPlansPage.class);
                startActivity(myPlansPage);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
            }
        });



    }
}