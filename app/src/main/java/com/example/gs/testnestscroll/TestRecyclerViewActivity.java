package com.example.gs.testnestscroll;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.gs.testnestscroll.myview.TestRecyclerViewAdapter;

public class TestRecyclerViewActivity extends Activity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler);
        Log.e("xie", "activity onCreate:...");
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this
                , LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setAdapter(new TestRecyclerViewAdapter(mRecyclerView));
        mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
                super.onDraw(c, parent, state);
                Paint p = new Paint();
                p.setColor(0xff000000);
                c.drawText("div", 0, 0, p);
//                c.drawRect(new RectF(0, 0, 30, 30), p);
                int childCount = parent.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View child = parent.getChildAt(i);
                    int left = child.getLeft();
                    int top = child.getBottom();
                    int right = child.getRight();
                    int bottom = top + 10;
//                    mLine.setBounds(left, top, right, bottom);
                    RectF rect = new RectF(0, 0, 30, 30);
                    rect.set(left, top, right, bottom);
                    c.drawRect(rect, p);
                }
            }

            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.set(0, 0, 0, 10);
            }
        });
//        System.out.println(recyclerView.getScrapCount());
        mRecyclerView.post(new Runnable() {
            @Override
            public void run() {
                System.out.println(mRecyclerView.getChildCount());
            }
        });
        mRecyclerView.addOnChildAttachStateChangeListener(new RecyclerView.OnChildAttachStateChangeListener() {
            @Override
            public void onChildViewAttachedToWindow(View view) {

            }

            @Override
            public void onChildViewDetachedFromWindow(View view) {

            }
        });

//        View view = LayoutInflater.from(this).inflate(R.layout.item_test_view, null);
//        mRecyclerView.addView(view);

    }
}
