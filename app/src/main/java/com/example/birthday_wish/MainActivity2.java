package com.example.birthday_wish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private View name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void createbithrdaybutton(View view) {
        name = findViewById(R.id.nameinput);
        String input = name.toString();
        Toast.makeText(this, "button was clicked $name", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("name", String.valueOf(name));
        startActivity(intent);
    }
}