package com.example.birthday_wish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView setname = findViewById(R.id.setname);

        Intent intent  = getIntent();
        String inputsms = intent.getStringExtra("sendsms");
        setname.setText("Happy Birthday \n"+inputsms+"!");







    }
}