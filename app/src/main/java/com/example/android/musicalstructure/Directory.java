package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Directory extends AppCompatActivity {
    CommonBehavior commonBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        commonBehavior = new CommonBehavior(this);
        commonBehavior.showHideStatueBar();
        setContentView(R.layout.activity_directory);

        commonBehavior.setBehavior();
    }

    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
}
