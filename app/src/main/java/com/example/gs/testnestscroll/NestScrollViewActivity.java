package com.example.gs.testnestscroll;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;

public class NestScrollViewActivity extends Activity {

    private NestedScrollView mNs1;
    private NestedScrollView mNs2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nest_scroll_view);
        mNs1 = findViewById(R.id.ns_1);
        mNs2 = findViewById(R.id.ns_2);
        mNs1.setNestedScrollingEnabled(true);
        mNs2.setNestedScrollingEnabled(true);


    }
}
