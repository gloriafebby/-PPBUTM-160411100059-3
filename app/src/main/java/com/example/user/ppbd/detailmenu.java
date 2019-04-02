package com.example.user.ppbd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.user.ppbd.R;

public class detailmenu extends AppCompatActivity {
    TextView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailmenu);
        menu = findViewById(R.id.menu);
        menu.setText(getIntent().getStringExtra("menu"));
    }
}
