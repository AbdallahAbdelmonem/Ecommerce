package com.example.e_commerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSignUp(View view){
        Intent in=new Intent(this, HomePage.class);
        startActivity(in);
    }

    public void openHomePage(View view){

        Intent in=new Intent(this, HomePage.class);
        startActivity(in);
    }
    public void aboutus(View view){
        Intent in=new Intent(this,AboutUs.class);
        startActivity(in);
    }


}