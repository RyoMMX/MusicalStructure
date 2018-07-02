package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Library extends AppCompatActivity {
    CommonBehavior commonBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        commonBehavior = new CommonBehavior(this);
        commonBehavior.showHideStatueBar();
        setContentView(R.layout.activity_library);

        commonBehavior.setBehavior();
    }

    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
}
