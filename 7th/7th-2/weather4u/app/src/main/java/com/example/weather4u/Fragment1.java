package com.example.weather4u;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fragment1 extends Fragment {

    AdapterView.OnItemSelectedListener listener;

    public Fragment1(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment1,container,false);


        //array에 sample data 추
        String[] seoul = {
                "5/31 SUN - Cloudy - 27/17",
                "6/1 MON - Cloudy/Sunny - 26/14",
                "6/2 TUE - Rainy - 23/17",
                "6/3 WED - Cloudy/Sunny - 27/17",
                "6/4 THU - Cloudy/Sunny - 27/15",
                "6/5 FRI - Sunny - 28/16",
                "6/6 SAT - Sunny - 29/17",
        };

        List<String> wwseoul = new ArrayList<String>(Arrays.asList(seoul));

        //fragment의 layout을 inflate
        View rView = inflater.inflate(R.layout.fragment1, container, false);


        //listView 생성
        ListView listView = rView.findViewById(R.id.fl1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                /*
                String forecast = mForecastAdapter.getItem(position);
                Toast.makeText(getActivity(), forecast, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra("data", forecast);
                */
            }
        });
        return rView;
    }

//    // Container Activity must implement this interface
//    public interface OnItemSelectedListener {
//
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        try {
//            listener = (AdapterView.OnItemSelectedListener) context;
//        }
//        catch (ClassCastException e) {
//            throw new ClassCastException(context.toString() + " must implement OnItemSelectedListener");
//        }
//    }

}
