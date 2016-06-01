package com.jgabrielfreitas.layoutid.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jgabrielfreitas.layoutid.annotations.InjectLayout;

/**
 * Created by JGabrielFreitas on 31/05/16.
 */
public abstract class InjectLayoutBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getClass().getAnnotation(InjectLayout.class) != null) {
            if (getClass().getAnnotation(InjectLayout.class).layout() != -1) {
                setContentView(getClass().getAnnotation(InjectLayout.class).layout());
            }
        }
    }

}
