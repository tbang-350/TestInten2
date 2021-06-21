package com.example.testintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);

        Intent Testintent = getIntent();

        String usrname = Testintent.getStringExtra("username");
        String psswrd = Testintent.getStringExtra("password");
        String phnnumb = Testintent.getStringExtra("phonenumber");

        textView.setText(usrname);
        textView2.setText(psswrd);
        textView3.setText(phnnumb);

    }
}