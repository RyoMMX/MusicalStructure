package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by muhammad on 10/6/2017.
 */

public class BarButtonClickListener implements View.OnClickListener {
    AppCompatActivity appCompatActivity;
    CommonBehavior commonBehavior;

    BarButtonClickListener(AppCompatActivity appCompatActivity, CommonBehavior commonBehavior) {
        this.appCompatActivity = appCompatActivity;
        this.commonBehavior = commonBehavior;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.bar_button_home:
                goToActivity(MainActivity.class);
                break;

            case R.id.bar_button_library:
                goToActivity(Library.class);
                break;

            case R.id.bar_button_search:
                goToActivity(Search.class);
                break;

            case R.id.bar_button_store:
                goToActivity(Store.class);
                break;

            case R.id.bar_button_directory:
                goToActivity(Directory.class);
                break;

        }
        commonBehavior.showHideStatueBar();
    }

    private void goToActivity(Class activity) {
        Intent intent = new Intent(appCompatActivity, activity);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        appCompatActivity.startActivity(intent);
        appCompatActivity.overridePendingTransition(0, 0);
    }



}
