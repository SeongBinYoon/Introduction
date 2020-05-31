package com.example.weather4u;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fragment2 extends Fragment {

    public Fragment2(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment2,container,false);

        //array에 sample data 추
        String[] busan = {
                "5/31 SUN - Cloudy/Sunny - 23/17",
                "6/1 MON - Cloudy/Sunny - 25/16",
                "6/2 TUE - Cloudy/Sunny - 24/18",
                "6/3 WED - Cloudy - 24/18",
                "6/4 THU - Cloudy - 26/18",
                "6/5 FRI - Cloudy/Sunny - 24/17",
                "6/6 SAT - Sunny - 25/17",
        };

        List<String> wwbusan = new ArrayList<String>(Arrays.asList(busan));

        //fragment의 layout을 inflate
        View rView = inflater.inflate(R.layout.fragment2, container, false);

        //listView 생성
        ListView listView = rView.findViewById(R.id.fl2);
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
}
