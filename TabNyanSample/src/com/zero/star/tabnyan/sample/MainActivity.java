package com.zero.star.tabnyan.sample;

import android.os.Bundle;

import com.zero.star.tabnyan.TabNyanActivity;

public class MainActivity extends TabNyanActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // setup tab
        setup(R.id.realtabcontent, null);

        addTab("tab1", "Tab1", Tab1Fragment.class);
        addTab("tab2", "Tab2", Tab2Fragment.class);

    }

}
