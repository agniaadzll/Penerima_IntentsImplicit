package com.example.penerimaintentimplisit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text_uri_message);
        Intent intent = getIntent();
        Intent intent = getIntent();

        if (Uri!= null) {
            String uri_string = "URI: " + Uri.toString();
            textView.setText(uri_string);
        }
    }
}