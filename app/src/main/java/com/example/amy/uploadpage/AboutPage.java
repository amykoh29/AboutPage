package com.example.amy.uploadpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class AboutPage extends AppCompatActivity{

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private Button web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        TabLayout.Tab tab1 = tabLayout.newTab(), tab2 = tabLayout.newTab(), tab3 = tabLayout.newTab();
        tab1.setText("About the Organization");
        tab2.setText("Features");
        tab3.setText("About Tinovation");

        tabLayout.addTab(tab1);
        tabLayout.addTab(tab2);
        tabLayout.addTab(tab3);

        final MyAdapter adapter = new MyAdapter(this,getSupportFragmentManager(), 3);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab){
                viewPager.setCurrentItem(tab.getPosition());
            }
            public void onTabUnselected(TabLayout.Tab tab){

            }
            public void onTabReselected(TabLayout.Tab tab){

            }
        });

    }

}
