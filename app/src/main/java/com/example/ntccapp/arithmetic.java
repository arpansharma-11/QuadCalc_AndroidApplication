package com.example.ntccapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class arithmetic extends AppCompatActivity {

    private EditText num1, num2;
    private TextView tv;
    private Button add, diff, mul, div, mod, floatdiv;
    Float n1,n2,n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        tv = findViewById(R.id.showResult);
        add = findViewById(R.id.add);
        diff = findViewById(R.id.diff);
        mul = findViewById(R.id.multiply);
        div = findViewById(R.id.div);
        mod = findViewById(R.id.mod);
        floatdiv = findViewById(R.id.floatdiv);
    }


    public void Add(View v)
    {
        String val;
        val = "RESULT: ";
        n1 = Float.parseFloat(num1.getText().toString());
        n2 = Float.parseFloat(num2.getText().toString());
        n3 = n1 + n2;
        val = val + String.valueOf(n3);
        tv.setText(val);
    }

    public void Diff(View v)
    {
        String val;
        val = "RESULT: ";
        n1 = Float.parseFloat(num1.getText().toString());
        n2 = Float.parseFloat(num2.getText().toString());
        n3 = n1 - n2;
        val = val + String.valueOf(n3);
        tv.setText(val);
    }

    public void Multiply(View v)
    {
        String val;
        val = "RESULT: ";
        n1 = Float.parseFloat(num1.getText().toString());
        n2 = Float.parseFloat(num2.getText().toString());
        n3 = n1 * n2;
        val = val + String.valueOf(n3);
        tv.setText(val);
    }

    public void Divide(View v)
    {
        String val;
        val = "RESULT: ";
        int n1,n2,n3;
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        n3 = n1 / n2;
        val = val + String.valueOf(n3);
        tv.setText(val);
    }

    public void Mod(View v)
    {
        String val;
        val = "RESULT: ";
        int n1,n2,n3;
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        n3 = n1 % n2;
        val = val + String.valueOf(n3);
        tv.setText(val);
    }

    public void floatdiv(View v)
    {
        String val;
        val = "RESULT: ";
        n1 = Float.parseFloat(num1.getText().toString());
        n2 = Float.parseFloat(num2.getText().toString());
        n3 = n1 / n2;
        val = val + String.valueOf(n3);
        tv.setText(val);
    }

}