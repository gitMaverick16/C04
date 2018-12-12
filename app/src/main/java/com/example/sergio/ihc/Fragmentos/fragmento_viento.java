package com.example.sergio.ihc.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sergio.ihc.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragmento_viento extends Fragment {


    public fragmento_viento() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragmento_viento, container, false);
    }

}
