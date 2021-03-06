package com.khavronsky.testviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BaseFragment extends Fragment {
    final String TAG = "!!!BASE FRAGMENT";
    static final  String TAB_TITLE = "tab_title";
    static final String COLOUR = "colour";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.base_fragment, container, false);
        Bundle bundle = getArguments();
        Log.d(TAG, "onCreateView: 1");
        if (bundle != null){
            String tabTitle = bundle.getString(TAB_TITLE);
            int colour = bundle.getInt(COLOUR);
            view.setBackgroundColor(colour);
            TextView textView = (TextView) view.findViewById(R.id.tv);
            textView.setText(tabTitle);
        }
        return view;
    }
}
