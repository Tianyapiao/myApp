package com.example.asus.algorithm.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.algorithm.R;

/**
 * Created by Asus on 2018/1/7.
 */

public class IndexFragment extends Fragment {
    /*private String context;
    private TextView mTextView;


    public IndexFragment(String context) {
        this.context = context;
    }
*/


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.indexfragment, container, false);

        return view;
    }
}
