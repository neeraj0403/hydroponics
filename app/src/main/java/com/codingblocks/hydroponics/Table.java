package com.codingblocks.hydroponics;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Table extends Fragment {
    RecyclerView recyclerView3;


    public Table() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View view=inflater.inflate(R.layout.fragment_table, container, false);
     recyclerView3=view.findViewById(R.id.recycle_table);

        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        Log.d("in", " i am after setorientation ");
        recyclerView3.setLayoutManager(linearLayoutManager);
        final List<table_pojo>  list1=new ArrayList<>();
        list1.add(new table_pojo("African Violets","6.0-7.0","1.2-1.5","840-1050"));

        list1.add(new table_pojo("Anthurium ",     " 5.0-6.0","1.6-2.0"," 1120-1400"));
        list1.add(new table_pojo("onion    ",      " 6.0-6.7","1.4-1.8","  980-1260"));
        list1.add(new table_pojo("Pea      ",      " 6.0-7.0","0.8-1.8","  980-1260"));
        list1.add(new table_pojo("strawberries",   "5-6    ","1.5-2.5", "  1050-1750"));
        list1.add(new table_pojo("sweet corn  ",   "6.0-7.0","1.6-2.0","1120-1400"));
        list1.add(new table_pojo("Tomato       ",  "5.5-6.5","2.0-5.0","1400-1750"));
        list1.add(new table_pojo("watermelon   ","6.5-6.8","1.5-2.4","1260-1680"));
        list1.add(new table_pojo("Taro         ",  " 5.5-6.0","2.0-2.5","1750-2100"));
        list1.add(new table_pojo("Tyme         ",  "5.5-7.0","0.8-1.6","980-1260"));
        list1.add(new table_pojo("sage         ",  "6.0-6.7","1.8-2.8","910-1000"));
        list1.add(new table_pojo("Pea          ",  "6.5-7.0","0.8-1.8","980-1260"));
        table_recycler table_recycler=new table_recycler(list1,getContext());
        recyclerView3.setAdapter(table_recycler);

        Log.e("in", " i am in popup when button jst clicked " );

        return view;

    }

}
