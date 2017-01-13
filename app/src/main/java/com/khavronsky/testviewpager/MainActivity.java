package com.khavronsky.testviewpager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {
    private ViewPager viewPager;
    private FragmentPagerAdapter adapter;
    PagerTabStrip pagerTabStrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        severalFragmentsPager();

        oneFragmentPager();

    }

    private void oneFragmentPager() {
        adapter = new AdapterToBaseFragment(getSupportFragmentManager(), this);

        viewPager = (ViewPager) findViewById(R.id.my_pager);
        pagerTabStrip = (PagerTabStrip) findViewById(R.id.pager_tab_strip);
        viewPager.setCurrentItem(1);

    }

    private void severalFragmentsPager() {
        adapter = new MyFragmentAdapter(getSupportFragmentManager());

        viewPager = (ViewPager) findViewById(R.id.my_pager);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(1);
    }
}
