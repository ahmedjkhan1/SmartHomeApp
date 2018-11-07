package com.example.ajkhan1.smarthomeapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends Activity {

    Bundle bundle;
    String value;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_activity);
        textView = (TextView) findViewById(R.id.textView3);
        // Get Bundle
        bundle = getIntent().getExtras();

        // Extract value
        value = bundle.getString("roomName");
        // Setting value to the particular TextView
        textView.setText(value);
    }
}