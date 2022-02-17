package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CaesarCipher extends AppCompatActivity {
    public static String caesar(String str) {        //metoda szyfrujaca;
        char x[] = str.toCharArray();

        for (int i = 0; i != x.length; i++) {
            int n = x[i];
            n += 5;
            x[i] = (char) n;
        }
        return new String(x);
    }

    public static String caesarback(String str) {     //metoda deszyfrujaca;
        char x[] = str.toCharArray();

        for (int i = 0; i != x.length; i++) {
            int n = x[i];
            n -= 0;
            x[i] = (char) n;
        }
        return new String(x);
    }
}