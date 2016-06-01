package com.jgabrielfreitas.layoutid.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jgabrielfreitas.layoutid.annotations.InjectLayout;

/**
 * Created by JGabrielFreitas on 31/05/16.
 */
public abstract class InjectLayoutBaseFragment extends Fragment {

    View view;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        int layoutToInflate = 0;

        if (getClass().getAnnotation(InjectLayout.class) != null) {
            if (getClass().getAnnotation(InjectLayout.class).layout() != -1) {
                layoutToInflate = getClass().getAnnotation(InjectLayout.class).layout();
            }
        }

        view  = inflater.inflate(layoutToInflate, container, false);

        return view;
    }

    public View getView() {
        return view;
    }
}
