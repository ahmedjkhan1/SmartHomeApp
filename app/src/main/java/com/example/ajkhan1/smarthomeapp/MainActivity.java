package com.example.ajkhan1.smarthomeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText0, editText1;
    Button userB,passB,subB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button3 = findViewById(R.id.kitchen);

        button3.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){

                String roomName = "Kitchen";
                Intent intent = new Intent
                        (MainActivity.this, RoomDetail.class);
                intent.putExtra("roomName", roomName);
                startActivity(intent);
            }


        });

    }
}
