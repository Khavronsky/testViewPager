package com.khavronsky.testviewpager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {
    private ViewPager viewPager;
    private MyFragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MyFragmentAdapter(getSupportFragmentManager());

        viewPager = (ViewPager) findViewById(R.id.my_pager);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(1);

    }
}
