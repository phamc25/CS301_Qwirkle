package edu.up.cs301_quirkle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class QwirkleTiles extends SurfaceView {

    private Bitmap tile;
    private Paint darkGreenPaint;

    public QwirkleTiles(Context context, AttributeSet attrs) {

        super(context, attrs);
        setWillNotDraw(false);
        darkGreenPaint = new Paint();
        darkGreenPaint.setColor(0xFF119722);  //a bright red
        darkGreenPaint.setStyle(Paint.Style.STROKE);
        tile = BitmapFactory.decodeResource(getResources(), R.drawable.tile_blue_circle);
        setBackgroundColor(0xFFFFFFFF);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(tile, 400, 400, darkGreenPaint);
    }
}
