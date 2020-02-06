package com.example.hieu_phong_vu_comp304_sec003_lab02_ex2b;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

public class ListMenuFragment extends Fragment {
    String[] activities = new String[]{"AIActivity","VRActivity"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_list, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, activities);
        ListView list = (ListView) view.findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(getActivity(),AIActivity.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent=new Intent(getActivity(),VRActivity.class);
                    startActivity(intent);
                }
            }
        });
        Toast.makeText(getActivity(),getResources().getString(R.string.Frag1Create),Toast.LENGTH_SHORT).show();
        return view;
    }

    public void onStart(){
        super.onStart();
        Toast.makeText(getActivity(),getResources().getString(R.string.Frag1Start),Toast.LENGTH_SHORT).show();
    }
}
