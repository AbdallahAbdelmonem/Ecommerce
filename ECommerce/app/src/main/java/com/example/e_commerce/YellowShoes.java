package com.example.e_commerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class YellowShoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow_shoes);
    }
    public void openHomePageINYellowShoes(View view){
        Intent in=new Intent(this, HomePage.class);
        startActivity(in);
        Toast.makeText(this, "Successfully added", Toast.LENGTH_SHORT).show();
        Intent service=new Intent(getBaseContext(), MyService2.class);
        startService(service);
    }
}