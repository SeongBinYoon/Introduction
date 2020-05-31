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

public class Fragment4 extends Fragment {

    public Fragment4(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment4,container,false);

        //array에 sample data 추
        String[] jeju = {
                "5/31 SUN - Cloudy - 15/11",
                "6/1 MON - Cloudy/Sunny - 17/10",
                "6/2 TUE - Cloudy/Sunny - 18/13",
                "6/3 WED - Cloudy - 19/13",
                "6/4 THU - Cloudy - 19/11",
                "6/5 FRI - Cloudy/Sunny - 18/11",
                "6/6 SAT - Cloudy/Sunny - 18/11",
        };

        List<String> wwjeju = new ArrayList<String>(Arrays.asList(jeju));

        //fragment의 layout을 inflate
        View rView = inflater.inflate(R.layout.fragment4, container, false);

        //listView 생성
        ListView listView = rView.findViewById(R.id.fl4);
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
