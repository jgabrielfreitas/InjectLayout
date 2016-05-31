package com.jgabrielfreitas.layoutid.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.jgabrielfreitas.layoutid.annotations.LayoutId;
import com.jgabrielfreitas.layoutid.activity.LayoutIdBaseActivity;

@LayoutId(layout = R.layout.activity_main)
public class MainActivity extends LayoutIdBaseActivity implements View.OnClickListener {

    Button showUsingFragmentButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        showUsingFragmentButton = (Button) findViewById(R.id.showUsingFragmentButton);
        showUsingFragmentButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, ShowFragmentExampleActivity.class);
        startActivity(intent);
    }
}
