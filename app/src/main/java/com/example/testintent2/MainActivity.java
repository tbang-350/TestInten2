package com.example.testintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private EditText phonenumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        phonenumber = (EditText) findViewById(R.id.phonenumber);


    }

    public void SendMessage(View view) {
        Intent TestIntent = new Intent(this,MainActivity2.class);
        String user = username.getText().toString();
        String pass = password.getText().toString();
        String numb = phonenumber.getText().toString();

        TestIntent.putExtra("username",user);
        TestIntent.putExtra("password",pass);
        TestIntent.putExtra("phonenumber",numb);

        startActivity(TestIntent);


    }
}