package com.example.ntccapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    String val1,val2,temp1,temp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.username);
        et2=findViewById(R.id.password);


        SharedPreferences sharedPreferences =getSharedPreferences("MyPref",MODE_PRIVATE);
        String username=sharedPreferences.getString("username","");
        String password=sharedPreferences.getString("password","");
        et1.setText(username);
        et2.setText(password);
        temp1=et1.getText().toString();
        temp2=et2.getText().toString();

    }

    public void launchnewuser(View view) {



        Intent i = new Intent(MainActivity.this, newuser.class  );
        startActivity(i);
        finish();
    }

    public void launchmain(View view) {

        val1= et1.getText().toString();
        val2 = et2.getText().toString();
        if (val1.equals(temp1) && val2.equals(temp2)){
            Intent i = new Intent(MainActivity.this, insideProject.class);
            if(val1.isEmpty())
            {
                Toast.makeText(getApplicationContext(),"NO USER",Toast.LENGTH_LONG).show();
            }
            else
            {
                startActivity(i);
                finish();

            }}
        else{
            Toast.makeText(getApplicationContext(),"Wrong credentials",Toast.LENGTH_LONG).show();

        }
    }
}