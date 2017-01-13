package com.khavronsky.testviewpager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.util.Log;

public class MainActivity extends FragmentActivity {
    final String TAG = "!!!MAIN";
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
        Log.d(TAG, "oneFragmentPager: 1");
        viewPager = (ViewPager) findViewById(R.id.my_pager);
        Log.d(TAG, "oneFragmentPager: 2");
        viewPager.setAdapter(adapter);
        Log.d(TAG, "oneFragmentPager: 3");
        viewPager.setCurrentItem(1);
        Log.d(TAG, "oneFragmentPager: 4");
        pagerTabStrip = (PagerTabStrip) findViewById(R.id.pager_tab_strip);
    }

    private void severalFragmentsPager() {
        adapter = new MyFragmentAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.my_pager);
        viewPager.setAdapter(adapter);

        viewPager.setCurrentItem(1);
    }
}
