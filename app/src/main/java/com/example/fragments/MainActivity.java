package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity  implements communicator{

    Fragmentcount frarmentcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frarmentcount = (Fragmentcount) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView2);
    }



    @Override
    public void count(int i) {
        frarmentcount.UpDataTextCounter(i);
    }
}