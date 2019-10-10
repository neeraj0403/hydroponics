package com.codingblocks.hydroponics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = findViewById(R.id.tablayout);
        TabItem Books = findViewById(R.id.nutrient);

//       Toolbar toolbar = findViewById(R.id.toolbar);
        TabItem Journal = findViewById(R.id.table);
        final TabItem conference = findViewById(R.id.growcost);
        final TabItem seminar = findViewById(R.id.troubleshoot);
        ViewPager pager = findViewById(R.id.viewpager);

        pageadapter pageAdapter = new pageadapter(getSupportFragmentManager(), tabLayout.getTabCount());
        pager.setAdapter(pageAdapter);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}
