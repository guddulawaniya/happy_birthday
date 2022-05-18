package com.example.birthday_wish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = findViewById(R.id.button);
        EditText name = findViewById(R.id.nameinput);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().trim().length()!=0)
                {

                    String input = name.getText().toString();

                    Toast.makeText(MainActivity2.this, "Button Was Clicked "+input, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                    intent.putExtra("sendsms",input);
                    startActivity(intent);

                }
                else
                {

                    Toast.makeText(MainActivity2.this, "Enter The Name ", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }

}