package com.codingblocks.hydroponics;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class growcost extends Fragment {


    public growcost() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final EditText cost,noh,totwatt,tothours,grwlight;
        Button btn;

        final View view= inflater.inflate(R.layout.fragment_growcost, container, false);
        cost=view.findViewById(R.id.kwh);
        noh=view.findViewById(R.id.no_of_hours);
        grwlight=view.findViewById(R.id.growlighting);
        btn=view.findViewById(R.id.calculatecost);


        tothours=view.findViewById(R.id.operateperday);
        totwatt=view.findViewById(R.id.totwatt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                   String cost1=cost.getText().toString();
                    final String  noh1=noh.getText().toString();
                    final String totwatt1=totwatt.getText().toString();
                    final String  tothours1=tothours.getText().toString();
                    final String  growlightning=grwlight.getText().toString();
                  Float ans=(Float.parseFloat(noh1)*Float.parseFloat(totwatt1))/1000;
                      Float cost=ans*Float.parseFloat(cost1);
 String dcost=String.valueOf(cost);
 String  mcost=String.valueOf(cost*31);
 String ycost=String.valueOf(cost*31*12);




                    Intent i = new Intent(getContext(), growcostcalci.class);
                   i.putExtra("day cost",dcost);
                   i.putExtra("month cost",mcost);
                   i.putExtra("year cost",ycost);
                   startActivity(i);
                }


        });


        return view;
    }

}
