package com.example.hieu_phong_vu_comp304_sec003_lab02_ex2b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class DetailsFragment extends Fragment {
    static TextView textViewDetails;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        textViewDetails=(TextView)view.findViewById(R.id.textViewDetails);
        Toast.makeText(getActivity(),getResources().getString(R.string.Frag2Create),Toast.LENGTH_SHORT).show();
        return view;
    }

    public void onStart(){
        super.onStart();
        Toast.makeText(getActivity(),getResources().getString(R.string.Frag2Start),Toast.LENGTH_SHORT).show();
    }
}
