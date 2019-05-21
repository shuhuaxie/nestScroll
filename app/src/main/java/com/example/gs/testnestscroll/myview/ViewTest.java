package com.example.gs.testnestscroll.myview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Region;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class ViewTest extends View {
    public int startPos = 0;
    public static Canvas saveCanvas;
    Paint paint = new Paint();
    public ViewTest(Context context) {
        super(context);
    }

    public ViewTest(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ViewTest(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Log.e("xie", "draw..:" + Thread.currentThread().getName());
////        if (saveCanvas == null) {
////            saveCanvas = canvas;
////        } else {
////            Log.e("xie", "equal?.." + (canvas == saveCanvas));
////        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//
//        }
//        startPos++;
//        if (startPos == getWidth() - 30) {
//            startPos = 0;
//        }
//        Paint paint = new Paint();
//        paint.setColor(0xffff0000);
//        canvas.drawRect(startPos, 0, startPos + 30, 20, paint);
//        invalidate();

        paint.setAntiAlias(true);                           //设置画笔为无锯齿
        paint.setColor(Color.BLACK);                        //设置画笔颜色
        paint.setTextSize((float) 30.0);                    //设置字体大小

        canvas.clipRect(100, 100, 350, 600, Region.Op.INTERSECT);//设置显示范围
        canvas.drawColor(Color.RED);
        canvas.drawCircle(100,100,100,paint);
    }
}
