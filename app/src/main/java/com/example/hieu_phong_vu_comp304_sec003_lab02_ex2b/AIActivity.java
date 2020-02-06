package com.example.hieu_phong_vu_comp304_sec003_lab02_ex2b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AIActivity extends AppCompatActivity {
    TextView textViewAIDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);
        textViewAIDetails=(TextView)findViewById(R.id.textViewAIDetails);
        textViewAIDetails.append(getResources().getString(R.string.AICreate));
    }

    protected void onStart(){
        super.onStart();
        textViewAIDetails.append("\n"+getResources().getString(R.string.AIStart));
    }

    protected void onResume(){
        super.onResume();
        textViewAIDetails.append("\n"+getResources().getString(R.string.AIResume));
    }

    protected void onPause(){
        super.onPause();
        textViewAIDetails.append("\n"+getResources().getString(R.string.AIPause));
    }

    protected void onStop(){
        super.onStop();
        textViewAIDetails.append("\n"+getResources().getString(R.string.AIStop));
    }

    protected void onDestroy(){
        super.onDestroy();
        textViewAIDetails.append("\n"+getResources().getString(R.string.AIDestroy));
    }
}
