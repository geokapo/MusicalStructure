package com.example.android.musicalstructure;

import android.app.Activity;
import android.os.Bundle;
import com.example.android.musicalstructure.R;


public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
