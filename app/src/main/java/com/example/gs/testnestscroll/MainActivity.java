package com.example.gs.testnestscroll;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.to_normal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NestScrollViewActivity.class));
            }
        });
        findViewById(R.id.test_sync).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TestSyncActivity.class));
            }
        });
        findViewById(R.id.test_recycler).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TestRecyclerViewActivity.class));
            }
        });
        findViewById(R.id.test_scroll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TestScrollViewActivity.class));
            }
        });
        View view = findViewById(R.id.to_normal);
//        while (view.getParent() != null) {
//            System.out.println("parent:" + view.getParent().getClass().getCanonicalName());
//            if (view.getParent() instanceof View) {
//                view = (View) view.getParent();
//            } else {
//                break;
//            }
//
//        }
        System.out.println("onCreate...");
//        Looper.getMainLooper().quit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume...");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        System.out.println("onAttachedToWindow...");
    }
}
