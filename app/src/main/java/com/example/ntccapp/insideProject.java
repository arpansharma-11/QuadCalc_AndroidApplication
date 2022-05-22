package com.example.ntccapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class insideProject extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_project_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b6=findViewById(R.id.b6);
    }


    public void launch1(View view) {
        Intent i = new Intent(getApplicationContext(), arithmetic.class);
        startActivity(i);
    }

    public void launch2(View view) {
        Intent i = new Intent(getApplicationContext(), trigonometric.class);
        startActivity(i);
    }

    public void launch3(View view) {
        Intent i = new Intent(getApplicationContext(), binary.class);
        startActivity(i);
    }

    public void launch6(View view) {
        Intent i = new Intent(getApplicationContext(), weight.class);
        startActivity(i);
    }
}