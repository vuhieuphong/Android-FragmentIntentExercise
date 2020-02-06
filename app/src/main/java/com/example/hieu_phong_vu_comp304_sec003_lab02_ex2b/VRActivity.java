package com.example.hieu_phong_vu_comp304_sec003_lab02_ex2b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VRActivity extends AppCompatActivity {
    TextView textViewVRDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr);
        textViewVRDetails=(TextView)findViewById(R.id.textViewVRDetails);
        textViewVRDetails.append(getResources().getString(R.string.VRCreate));
    }

    protected void onStart(){
        super.onStart();
        textViewVRDetails.append("\n"+getResources().getString(R.string.VRStart));
    }

    protected void onResume(){
        super.onResume();
        textViewVRDetails.append("\n"+getResources().getString(R.string.VRResume));
    }

    protected void onPause(){
        super.onPause();
        textViewVRDetails.append("\n"+getResources().getString(R.string.VRPause));
    }

    protected void onStop(){
        super.onStop();
        textViewVRDetails.append("\n"+getResources().getString(R.string.VRStop));
    }

    protected void onDestroy(){
        super.onDestroy();
        textViewVRDetails.append("\n"+getResources().getString(R.string.VRDestroy));
    }
}
