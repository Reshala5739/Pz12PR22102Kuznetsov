package com.example.pz12kuznetsovpr22102;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Table extends AppCompatActivity implements View.OnClickListener {
    ImageView borsh;
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        borsh = findViewById(R.id.borsh);
        borsh.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, ShowItems.class);
        startActivity(intent);
    }
}
