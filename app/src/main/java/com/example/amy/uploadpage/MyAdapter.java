package com.example.amy.uploadpage;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    private Context context;
    int totalTabs;
    public MyAdapter(Context c, FragmentManager fm, int totalTabs){
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }
    public Fragment getItem(int position){
        if(position==0){
            abtUs aUs = new abtUs();
            return aUs;
        }
        if(position==1){
            CtUs cUs = new CtUs();
            return cUs;
        }
        if(position==2){
            abtApp aApp = new abtApp();
            return aApp;
        }
        return null;
    }
    public int getCount(){
        return totalTabs;
    }
}
