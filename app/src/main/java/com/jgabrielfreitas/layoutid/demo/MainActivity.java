package com.jgabrielfreitas.layoutid.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jgabrielfreitas.layoutid.activity.InjectLayoutBaseActivity;
import com.jgabrielfreitas.layoutid.annotations.InjectLayout;

@InjectLayout(layout = R.layout.activity_main)
public class MainActivity extends InjectLayoutBaseActivity implements View.OnClickListener {

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
