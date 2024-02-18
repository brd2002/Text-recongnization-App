package com.example.textrecongnizationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnBoardingScreen extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addFragment(new Step.Builder().setTitle("Hey I am texty")
                .setContent("Here i want to help you")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.machinelearning) // int top drawable
                .setSummary("")
                .build());
        addFragment(new Step.Builder().setTitle("Hey I am texty")
                .setContent("I can make your task easy")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.textfiles) // int top drawable
                .setSummary("")
                .build());
        addFragment(new Step.Builder().setTitle("Hey I am texty")
                .setContent("I am now in andorid")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.android) // int top drawable
                .setSummary("")
                .build());
    }

    @Override
    public void finishTutorial() {
        // Your implementation
        Intent i = new Intent(this , MainActivity.class);
        startActivity(i);
        finish();
    }


    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}