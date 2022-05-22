package com.example.ntccapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class binary extends AppCompatActivity {

    private EditText num1, num2;
    private TextView tv;
    private Button and,or,nota,notb,xor;
    int n1,n2,n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        tv = findViewById(R.id.showResult);
        and = findViewById(R.id.and);
        or = findViewById(R.id.or);
        nota = findViewById(R.id.nota);
        notb = findViewById(R.id.notb);
        xor = findViewById(R.id.xor);
    }

    public void and(View view) {
        String val;
        val= "RESULT: ";
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        n3 = n1 & n2;
        val = val + String.valueOf(n3);
        tv.setText(val);
    }

    public void or(View view) {
        String val;
        val= "RESULT: ";
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        n3 = n1 | n2;
        val = val + String.valueOf(n3);
        tv.setText(val);
    }

    public void nota(View view) {
        String val;
        val= "RESULT: ";
        n1 = Integer.parseInt(num1.getText().toString());
        n3 = ~n1;
        val = val + String.valueOf(n3);
        tv.setText(val);
    }

    public void notb(View view) {
        String val;
        val= "RESULT: ";
        n2 = Integer.parseInt(num2.getText().toString());
        n3 = ~n2;
        val = val + String.valueOf(n3);
        tv.setText(val);
    }

    public void xor(View view) {
        String val;
        val= "RESULT: ";
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        n3 = n1 ^ n2;
        val = val + String.valueOf(n3);
        tv.setText(val);
    }

    public void lShift(View view) {
        String val;
        val= "RESULT: ";
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        n3 = n1 << n2;
        val = val + String.valueOf(n3);
        tv.setText(val);
    }

    public void rShift(View view) {
        String val;
        val= "RESULT: ";
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        n3 = n1 >> n2;
        val = val + String.valueOf(n3);
        tv.setText(val);
    }
}