package com.tinassist.neocbt.neocbt.week3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tinassist.neocbt.neocbt.R;

/**
 * Created by Jens on 11/19/16.
 */

public class W3P2 extends Fragment {
    public W3P2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.w3p2, container, false);
    }
}

