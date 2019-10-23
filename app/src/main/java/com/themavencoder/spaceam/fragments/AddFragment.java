package com.themavencoder.spaceam.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.themavencoder.spaceam.R;


public class AddFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_add, container, false);
        Log.d("EG196AA", "LAYOUT CALLED");

        return v;
    }

    @Override
    public void onAttach(Context context) {
        Log.d("ATTACHED", "Fragment Attached");
        super.onAttach(context);

    }
}
