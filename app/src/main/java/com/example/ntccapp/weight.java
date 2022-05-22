package com.example.ntccapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class weight extends AppCompatActivity {

    private EditText num1,num2;
    private TextView tv;
    private Button bmi;
    float n1,n2,r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);


        num1=findViewById(R.id.weight);
        num2=findViewById(R.id.height);
        tv=findViewById(R.id.showResult);
        bmi=findViewById(R.id.bmi);
    }

    public void bmi(View view) {
        DecimalFormat df = new DecimalFormat("#.###");
        String val;
        val= "RESULT: ";
        n1 = Float.parseFloat(num1.getText().toString());
        n2 = Float.parseFloat(num2.getText().toString());
        r= n1/(n2*n2);
        val= val + df.format(r);
        tv.setText(val);
    }


}