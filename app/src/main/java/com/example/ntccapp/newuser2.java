package com.example.ntccapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class newuser2 extends AppCompatActivity {

    EditText et1,et2;
    TextView tv;
    String val1, val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newuser2);
        et1=findViewById(R.id.newusername);
        et2=findViewById(R.id.newpassword);
        tv=findViewById(R.id.mistake);
        Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_LONG).show();

    }

    public void Correction(View v){

    }

    public void launchlogin(View view) {

        val1=et1.getText().toString();
        val2=et2.getText().toString();
        if (!val1.isEmpty() && !val2.isEmpty()) {
        int z1=0,z2=0,z3=0,s=0;
        SharedPreferences sharedPreferences =getSharedPreferences("MyPref",MODE_PRIVATE);
        SharedPreferences.Editor myeditor = sharedPreferences.edit();
        myeditor.putString("username",val1);
        myeditor.putString("password",val2);//key value
        myeditor.commit();
        for (int i=0;i< val2.length();i++)
        {
            char ch=val2.charAt(i);
            if (Character.isUpperCase(ch))
                z1=1;
            if (ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0')
                z2=1;
            if (ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')')
                z3=1;
            if (z1==1 && z2==1 && z3==1)
                s=1;
        }
        if (val2.length()>=8 && s==1) {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
            finish();
            Toast.makeText(getApplicationContext(),"Successfully Registered",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_LONG).show();
        }
        }
        else{
            if (val1.isEmpty() && val2.isEmpty())
                Toast.makeText(getApplicationContext(),"Please fill some data",Toast.LENGTH_SHORT).show();
            else if (val1.isEmpty())
                Toast.makeText(getApplicationContext(),"Please fill your Username",Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(getApplicationContext(),"Please fill your Password",Toast.LENGTH_SHORT).show();
        }


    }
}