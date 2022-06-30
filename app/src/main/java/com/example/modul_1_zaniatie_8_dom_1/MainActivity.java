package com.example.modul_1_zaniatie_8_dom_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvA = findViewById(R.id.tvA);
        TextView tvB = findViewById(R.id.tvB);
        TextView tvResult = findViewById(R.id.tvResult);

        EditText etA = findViewById(R.id.etA);
        EditText etB = findViewById(R.id.etB);

        Button btEnter = findViewById(R.id.btEnter);

        btEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a;
                double result;
                double b;

                try {
                    a = Double.parseDouble(etA.getText().toString());
                    b = Double.parseDouble(etB.getText().toString());

                    if (b == 0){
                        result = 0;
                        Log.d("MYLOG", "|1| You put in 0. Result: " + result);
                        tvResult.setText("|1| You put in 0.\nResult: " + result);
                        tvResult.setTextSize(18);
                    }else {
                        result = a / b;
                        Log.d("MYLOG", "|2| Result: " + result);
                        tvResult.setText("|2| Result: " + result);
                    }
                }catch (NumberFormatException nfe){
                    result = 1;
                    Log.d("MYLOG", "|3| Please, check your input. Result is: " + result);
                    tvResult.setText("|3| Please, check your input.\nResult: " + result);
                }

            }
        });


        //hardcoded input values
        Log.d("MYLOG", " - - - Hardcoded input values - - - ");

        double a = 4;
        double b = 0;
        double result;

        if (b == 0){
            result = 0;
            Log.d("MYLOG", "You put in wrong argument. Result: " + result);
        }

        //try-catch is not necessary
        try {
            result = a / b;
        }catch (Exception e){
            result = 0;
        }

        Log.d("MYLOG", "Result: " + result + ". Try-Catch method for division by zero " +
                "is not working as we don't have such Exception.");
        Log.d("MYLOG", " - - - OnClickListener - - - ");
    }
}