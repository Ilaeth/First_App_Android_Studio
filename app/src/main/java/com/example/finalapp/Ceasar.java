package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ceasar extends AppCompatActivity {
    private EditText wiadomosc;
    private TextView odszyfrowanie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceasar);
        wiadomosc = (EditText) findViewById(R.id.idText);
        odszyfrowanie = (TextView) findViewById(R.id.odszyfrowanie);
    }
    public void zaszyfuj(View view) {
        CaesarCipher cipher = new CaesarCipher();
        odszyfrowanie.setText(cipher.caesar(wiadomosc.getText().toString()));
    }

    public void odszyfruj(View view) {
        CaesarCipher cipher = new CaesarCipher();
        odszyfrowanie.setText(cipher.caesarback(wiadomosc.getText().toString()));
    }
}