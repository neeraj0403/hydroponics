package com.codingblocks.hydroponics;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.view.LayoutInflaterCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class nutrientfrag extends Fragment {


    public nutrientfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_nutrientfrag, container, false);
        Button submit=view.findViewById(R.id.submit);
        final EditText seed=view.findViewById(R.id.seed);
        TextView shopping=view.findViewById(R.id.amazon);



        final Context context=getActivity().getApplicationContext();

//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(getActivity().getApplicationContext(),popup.class);
//                startActivity(intent);
//            }
//        });
      submit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view1) {

     String str=seed.getText().toString();
            Intent intent=new Intent(getContext(),popup.class);
            intent.putExtra("seed name",str);
            startActivity(intent);

          }
      });
      shopping.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent launchIntent = getActivity().getPackageManager().getLaunchIntentForPackage("com.amazon.mShop.android.shopping");
              if (launchIntent != null) {
                  startActivity(launchIntent);//null pointer check in case package name was not found
              }
          }
      });
        return view;

    }

}
