package com.android.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.android.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_wb_incandescent extends SVGRenderer {

    public ic_wb_incandescent(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(3.55f, 18.54f);
        mPath.rLineTo(1.41f, 1.41f);
        mPath.rLineTo(1.79f, -1.8f);
        mPath.rLineTo(-1.41f, -1.41f);
        mPath.rLineTo(-1.79f, 1.8f);
        mPath.close();
        mPath.moveTo(3.55f, 18.54f);
        mPath.moveTo(11.0f, 22.45f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(13.0f, 19.5f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 2.95f);
        mPath.close();
        mPath.moveTo(11.0f, 22.45f);
        mPath.moveTo(4.0f, 10.5f);
        mPath.lineTo(1.0f, 10.5f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.close();
        mPath.moveTo(4.0f, 10.5f);
        mPath.rMoveTo(11.0f, -4.19f);
        mPath.lineTo(15.0f, 1.5f);
        mPath.lineTo(9.0f, 1.5f);
        mPath.rLineTo(0f, 4.81f);
        mPath.cubicTo(7.21f, 7.35f, 6.0f, 9.28f, 6.0f, 11.5f);
        mPath.rCubicTo(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        mPath.rCubicTo(3.3099995f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        mPath.rCubicTo(0.0f, -2.22f, -1.21f, -4.15f, -3.0f, -5.19f);
        mPath.close();
        mPath.moveTo(15.0f, 6.31f);
        mPath.rMoveTo(5.0f, 4.19f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(-3.0f, 0f);
        mPath.close();
        mPath.moveTo(20.0f, 10.5f);
        mPath.rMoveTo(-2.76f, 7.66f);
        mPath.rLineTo(1.79f, 1.8f);
        mPath.rLineTo(1.41f, -1.41f);
        mPath.rLineTo(-1.8f, -1.79f);
        mPath.rLineTo(-1.4f, 1.4f);
        mPath.close();
        mPath.moveTo(17.24f, 18.16f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}