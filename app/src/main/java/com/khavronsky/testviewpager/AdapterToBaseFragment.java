package com.khavronsky.testviewpager;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class AdapterToBaseFragment extends FragmentPagerAdapter {
    private String [] tabTitle;
    private int[] colour;

    public AdapterToBaseFragment(FragmentManager fm, Context context) {
        super(fm);
        Resources resources = context.getResources();
        tabTitle = resources.getStringArray(R.array.tab_title);
        colour = resources.getIntArray(R.array.colour);
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        bundle.putString(BaseFragment.TAB_TITLE, tabTitle[position]);
        bundle.putInt(BaseFragment.COLOUR, colour[position]);

        Fragment fragment = new BaseFragment();
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public int getCount() {
        return tabTitle.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }
}
