package com.example.reboot.permanentdatastorage;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void settext(View view)
    {
        SharedPreferences mypreferences=this.getSharedPreferences("com.example.reboot.permanentdatastorage", Context.MODE_PRIVATE);

        EditText myinputtext=(EditText)findViewById(R.id.editText);
        String input=myinputtext.getText().toString();
        mypreferences.edit().putString("username",input).apply();
        TextView mytextview = (TextView)findViewById(R.id.textView);
        mytextview.setText(input);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences mypreferences=this.getSharedPreferences("com.example.reboot.permanentdatastorage", Context.MODE_PRIVATE);
        TextView mytextview = (TextView)findViewById(R.id.textView);
        String input=mypreferences.getString("username","empty");
        mytextview.setText(input);
    }
    }

