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

public class Fragment3 extends Fragment {

    public Fragment3(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment3,container,false);

        //array에 sample data 추
        String[] gangwon = {
                "5/31 SUN - Cloudy/Sunny - 23/12",
                "6/1 MON - Rainy - 20/9",
                "6/2 TUE - Rainy - 20/13",
                "6/3 WED - Cloudy/Sunny - 23/13",
                "6/4 THU - Cloudy/Sunny - 23/10",
                "6/5 FRI - Sunny - 23/12",
                "6/6 SAT - Sunny - 24/12",
        };

        List<String> wwgangwon = new ArrayList<String>(Arrays.asList(gangwon));

        //fragment의 layout을 inflate
        View rView = inflater.inflate(R.layout.fragment3, container, false);

        //listView 생성
        ListView listView = rView.findViewById(R.id.fl3);
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
