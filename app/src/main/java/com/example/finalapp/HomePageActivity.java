package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void playButtonClickTic(View view) {
        Intent intent = new Intent(this, TicTacToe.class);
        startActivity(intent);
    }

    public void playButtonClickCar(View view) {
        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }

    public void playButtonClickCae(View view) {
        Intent intent = new Intent(this, Ceasar.class);
        startActivity(intent);
    }
}