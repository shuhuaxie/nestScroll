package com.example.gs.testnestscroll.myview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class CustomScrollView extends LinearLayout {
    float mScrollY;
    private float mLastMotionY;

    public CustomScrollView(Context context) {
        super(context);
    }

    public CustomScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                mLastMotionY = 0;
                break;
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                if (mLastMotionY != 0) {
                    mScrollY = event.getY() - mLastMotionY;
                }
                mLastMotionY = event.getY();
                Log.e("xie", "mLastMotionY:" + mLastMotionY);
                Log.e("xie", "mScrollY:" + mScrollY);
                requestLayout();
                break;
        }

        return true;

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        scrollBy(0, -new Float(mScrollY).intValue());
        mScrollY = 0;
    }
}
