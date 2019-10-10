package com.codingblocks.hydroponics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class popup extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        final EditText seed=findViewById(R.id.seed);

        final RecyclerView recyclerView= findViewById(R.id.recycle);
        final Context context=this;

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
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        DisplayMetrics metrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int width=metrics.widthPixels;
        int height=metrics.heightPixels;
        getWindow().setLayout((int) (width*0.9), (int)  (height*0.95)); String str=seed.getText().toString();
        if(str.equalsIgnoreCase("potato"))

        {
            popuprecycler popuprecycler=new popuprecycler(list1,context);
            recyclerView.setAdapter(popuprecycler);
        }



    }
}
