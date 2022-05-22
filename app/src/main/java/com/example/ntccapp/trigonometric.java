package com.example.ntccapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class trigonometric extends AppCompatActivity {

    private EditText num;
    private TextView tv;
    private Button sin,cos,tan,cot,cosec,sec ;
    double n;
    double r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigonometric);

        num = findViewById(R.id.num1);
        tv = findViewById(R.id.showResult);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        cot = findViewById(R.id.cot);
        cosec = findViewById(R.id.cosec);
        sec = findViewById(R.id.sec);

    }


    public void sin(View view) {
        DecimalFormat df = new DecimalFormat("#.###");
        String val;
        val= "RESULT: ";
        n = Double.parseDouble(num.getText().toString());
        r = Math.sin(Math.toRadians(n));
        val= val + df.format(r);
        tv.setText(val);
    }

    public void cos(View view) {
        DecimalFormat df = new DecimalFormat("#.###");
        String val;
        val = "RESULT: ";
        n = Double.parseDouble(num.getText().toString());
        r = Math.cos(Math.toRadians(n));
        val= val + df.format(r);
        tv.setText(val);
    }

    public void tan(View view) {
        DecimalFormat df = new DecimalFormat("#.###");
        String val;
        val= "RESULT: ";
        n = Double.parseDouble(num.getText().toString());
        r = Math.tan(Math.toRadians(n));
        val= val + df.format(r);
        tv.setText(val);
    }

    public void cot(View view) {
        DecimalFormat df = new DecimalFormat("#.###");
        String val;
        val= "RESULT: ";
        n = Double.parseDouble(num.getText().toString());
        r = 1/Math.tan(Math.toRadians(n));
        val= val + df.format(r);
        tv.setText(val);
    }

    public void cosec(View view) {
        DecimalFormat df = new DecimalFormat("#.###");
        String val;
        val= "RESULT: ";
        n = Double.parseDouble(num.getText().toString());
        r =1/Math.sin(Math.toRadians(n));
        val= val + df.format(r);
        tv.setText(val);
    }

    public void sec(View view) {
        DecimalFormat df = new DecimalFormat("#.###");
        String val;
        val= "RESULT: ";
        n = Double.parseDouble(num.getText().toString());
        r = 1/Math.cos(Math.toRadians(n));
        val= val + df.format(r);
        tv.setText(val);
    }
}