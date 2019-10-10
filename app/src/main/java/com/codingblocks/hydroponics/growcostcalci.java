package com.codingblocks.hydroponics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class growcostcalci extends AppCompatActivity {
 TextView pd,pm,py;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_growcostcalci);
        Intent intent=getIntent();
        Bundle extras=getIntent().getExtras();

        String day=extras.getString("day cost");
        String month=extras.getString("month cost");
        String year=extras.getString("year cost");
        pd=findViewById(R.id.costpd);
        pm=findViewById(R.id.costpm);
        py=findViewById(R.id.costpy);
        pd.setText(day);
        pm.setText(month);
        py.setText(year);

    }
}
