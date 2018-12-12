package com.example.sergio.ihc.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.sergio.ihc.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragmento_stock extends Fragment {


    public fragmento_stock() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragmento_stock, container, false);
    }

}
