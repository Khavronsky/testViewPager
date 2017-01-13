package com.khavronsky.testviewpager;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;


public class AdapterToBaseFragment extends FragmentPagerAdapter {

    final String TAG = "!!!ADAPTER";
    private String [] tabTitle;
    private int[] colour;

    public AdapterToBaseFragment(FragmentManager fm, Context context) {
        super(fm);
        Log.d(TAG, "CONSTRUCTOR: ");
        Resources resources = context.getResources();
        tabTitle = resources.getStringArray(R.array.tab_title);
        colour = resources.getIntArray(R.array.colour);
    }

    @Override
    public Fragment getItem(int position) {
        Log.d(TAG, "getItem: ");
        Bundle bundle = new Bundle();
        bundle.putString(BaseFragment.TAB_TITLE, tabTitle[position]);
        bundle.putInt(BaseFragment.COLOUR, colour[position]);
        Fragment fragment = new BaseFragment();
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public int getCount() {
        Log.d(TAG, "getCount: ");
        return tabTitle.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Log.d(TAG, "getPageTitle: ");
        return tabTitle[position];
    }
}
