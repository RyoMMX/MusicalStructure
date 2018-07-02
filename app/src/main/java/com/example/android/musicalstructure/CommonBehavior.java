package com.example.android.musicalstructure;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by muhammad on 10/6/2017.
 */

public class CommonBehavior {
    private AppCompatActivity appCompatActivity;

    private BarButtonClickListener barButtonClickListener;
    private Button bar_button_library;
    private Button bar_button_search;
    private Button bar_button_store;
    private Button bar_button_directory;
    private Button bar_button_home;
    private Button close_description_button;
    private TextView description_title;
    private TextView description_text;

    public CommonBehavior(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }

    public void setBehavior() {
        dealerVariable();
        setListeners();
        showHideStatueBar();

    }

    private void dealerVariable() {

        barButtonClickListener = new BarButtonClickListener(appCompatActivity, this);

        bar_button_library = (Button) appCompatActivity.findViewById(R.id.bar_button_library);
        bar_button_search = (Button) appCompatActivity.findViewById(R.id.bar_button_search);
        bar_button_store = (Button) appCompatActivity.findViewById(R.id.bar_button_store);
        bar_button_directory = (Button) appCompatActivity.findViewById(R.id.bar_button_directory);
        bar_button_home = (Button) appCompatActivity.findViewById(R.id.bar_button_home);
        close_description_button = (Button) appCompatActivity.findViewById(R.id.close_description_button);
        description_title = (TextView) appCompatActivity.findViewById(R.id.description_title);
        description_text = (TextView) appCompatActivity.findViewById(R.id.description_text);
    }

    private void setListeners() {
        CloseButtonListener closeButtonListener = new CloseButtonListener();

        bar_button_home.setOnClickListener(barButtonClickListener);
        bar_button_library.setOnClickListener(barButtonClickListener);
        bar_button_search.setOnClickListener(barButtonClickListener);
        bar_button_store.setOnClickListener(barButtonClickListener);
        bar_button_directory.setOnClickListener(barButtonClickListener);
        close_description_button.setOnClickListener(closeButtonListener);
    }

    public void showHideStatueBar() {
        if (Build.VERSION.SDK_INT < 16) {
            appCompatActivity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } else {
            View decorView = appCompatActivity.getWindow().getDecorView();

            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }

    class CloseButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            description_text.setVisibility(View.GONE);
            description_title.setVisibility(View.GONE);
            close_description_button.setVisibility(View.GONE);
        }
    }


}
