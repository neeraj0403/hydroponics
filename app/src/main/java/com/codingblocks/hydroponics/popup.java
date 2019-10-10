package com.codingblocks.hydroponics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class popup extends Activity {
RecyclerView recyclerView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        final EditText seed=findViewById(R.id.seed);

         recyclerView1= findViewById(R.id.recycle1);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        Log.d("in", " i am after setorientation ");
        recyclerView1.setLayoutManager(linearLayoutManager);
        final Context context=this;
        Log.e("in", " i am in popup when button jst clicked " );
        Intent intent=getIntent();
       Bundle bundle=intent.getExtras();
       String seed1=bundle.getString("seed name");


        final List<nutrient_frag_pojo> list1 = new ArrayList<>();
        list1.add(new nutrient_frag_pojo("##MKP##","167.04 gr"));
        list1.add(new nutrient_frag_pojo("##KNO3##","292.36 gr"));
        list1.add(new nutrient_frag_pojo("##Mgso4##","0 gr"));
        list1.add(new nutrient_frag_pojo("ZA","254.58 gr"));
        list1.add(new nutrient_frag_pojo("##SO4##","61.03 gr"));
        list1.add(new nutrient_frag_pojo("##FeEDTA##","19.24 gr"));
        list1.add(new nutrient_frag_pojo("##ZnSO4##","0.28 gr"));
        list1.add(new nutrient_frag_pojo("##H3BO3##","2.52 gr"));
        list1.add(new nutrient_frag_pojo("##MnSO4##","1.91 gr"));
        list1.add(new nutrient_frag_pojo("##CuSo4##","0.2 gr"));
        list1.add(new nutrient_frag_pojo("##Na2MoO4##","0.13 gr"));
        list1.add(new nutrient_frag_pojo("##Na##","0.03 gr"));

        Log.d("in", " i am after recyclerview1 ");

        final List<nutrient_frag_pojo> list2 = new ArrayList<>();
        list2.add(new nutrient_frag_pojo("##MKP##","181.26 gr"));
        list2.add(new nutrient_frag_pojo("##KNO3##","313.78 gr"));
        list2.add(new nutrient_frag_pojo("##Mgso4##","0 gr"));
        list2.add(new nutrient_frag_pojo("ZA","290.1 gr"));
        list2.add(new nutrient_frag_pojo("##SO4##","69.5 ppm"));
        list2.add(new nutrient_frag_pojo("##FeEDTA##","23.08 gr"));
        list2.add(new nutrient_frag_pojo("##ZnSO4##","0.31 gr"));
        list2.add(new nutrient_frag_pojo("##H3BO3##","2.87 gr"));
        list2.add(new nutrient_frag_pojo("##MnSO4##","2.16 gr"));
        list2.add(new nutrient_frag_pojo("##CuSo4##","0.32 gr"));
        list2.add(new nutrient_frag_pojo("##Na2MoO4##","0.13 gr"));
        list2.add(new nutrient_frag_pojo("##Na##","0.03 gr"));
        final List<nutrient_frag_pojo> list3 = new ArrayList<>();
        list3.add(new nutrient_frag_pojo("##MKP##","124.4 gr"));
        list3.add(new nutrient_frag_pojo("##KNO3##","611.16 gr"));
        list3.add(new nutrient_frag_pojo("##Mgso4##","0 gr"));
        list3.add(new nutrient_frag_pojo("ZA","417.59 gr"));
        list3.add(new nutrient_frag_pojo("##SO4##","99.8 ppm"));
        list3.add(new nutrient_frag_pojo("##FeEDTA##","19.24 gr"));
        list3.add(new nutrient_frag_pojo("##ZnSO4##","0.61 gr"));
        list3.add(new nutrient_frag_pojo("##H3BO3##","4.58 gr"));
        list3.add(new nutrient_frag_pojo("##MnSO4##","1.54 gr"));
        list3.add(new nutrient_frag_pojo("##CuSo4##","0.2 gr"));
        list3.add(new nutrient_frag_pojo("##Na2MoO4##","0.13 gr"));
        list3.add(new nutrient_frag_pojo("##Na##","0.03 gr"));

        DisplayMetrics metrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int width=metrics.widthPixels;
        int height=metrics.heightPixels;
        getWindow().setLayout((int) (width*0.9), (int)  (height*0.95));
        if(seed1.equalsIgnoreCase("tomato"))

        {
            popuprecycler popuprecycler=new popuprecycler(list1,context);
            recyclerView1.setAdapter(popuprecycler);
        }
     else if(seed1.equalsIgnoreCase("potato"))
        {
            popuprecycler popuprecycler=new popuprecycler(list2,context);
            recyclerView1.setAdapter(popuprecycler);

        }
        else if(seed1.equalsIgnoreCase("spinach"))
        {
            popuprecycler popuprecycler=new popuprecycler(list3,context);
            recyclerView1.setAdapter(popuprecycler);

        }

    }
}
