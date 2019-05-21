package com.example.gs.testnestscroll.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class TestRv extends RecyclerView {
    public TestRv(Context context) {
        super(context);
    }

    public TestRv(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TestRv(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onDraw(Canvas c) {
//        Log.e("xie", "onDraw start");
        // 分发draw和dispatchDraw,每次滑动的时候调用
        super.onDraw(c);
//        Log.e("xie", "onDraw end");
    }

    @Override
    public void draw(Canvas c) {
//        Log.e("xie", "draw start");
        super.draw(c);
//        Log.e("xie", "draw end");
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
//        Log.e("xie", "dispatchDraw start");
        super.dispatchDraw(canvas);
//        Log.e("xie", "dispatchDraw end");
    }

    @Override
    public View getChildAt(int index) {
        return super.getChildAt(index);
    }

    @Override
    public int getChildCount() {
        return super.getChildCount();
    }

    @Override
    public void onChildAttachedToWindow(View child) {
        super.onChildAttachedToWindow(child);
    }
}
