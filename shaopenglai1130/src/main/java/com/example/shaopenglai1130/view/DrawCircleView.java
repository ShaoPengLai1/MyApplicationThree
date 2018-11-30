package com.example.shaopenglai1130.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class DrawCircleView extends View {

    public float currentX=200;
    public float currentY=200;
    public DrawCircleView(Context context) {
        super(context);
    }

    public DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint mPaint=new Paint();
        mPaint.setColor(Color.RED);
        canvas.drawCircle(currentX,currentY,60,mPaint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        /**
         * 触摸坐标X
         */
        this.currentX=event.getX();
        /**
         * 触摸坐标Y
         */
        this.currentY=event.getY();
        /**
         * 重绘组件
         */
        invalidate();
        /**
         * 返回true 必须返回true 否则小球动不了
         */
        return true;
    }
}
