package com.example.hieu_phong_vu_comp304_sec003_lab02_ex2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DetailsFragment.textViewDetails.append(getResources().getString(R.string.MainCreate));
    }

    protected void onStart(){
        super.onStart();
        DetailsFragment.textViewDetails.append("\n"+getResources().getString(R.string.MainStart));
    }

    protected void onResume(){
        super.onResume();
        DetailsFragment.textViewDetails.append("\n"+getResources().getString(R.string.MainResume));
    }

    protected void onPause(){
        super.onPause();
        DetailsFragment.textViewDetails.append("\n"+getResources().getString(R.string.MainPause));
    }

    protected void onStop(){
        super.onStop();
        DetailsFragment.textViewDetails.append("\n"+getResources().getString(R.string.MainStop));
    }

    protected void onDestroy(){
        super.onDestroy();
        DetailsFragment.textViewDetails.append("\n"+getResources().getString(R.string.MainDestroy));
    }
}
