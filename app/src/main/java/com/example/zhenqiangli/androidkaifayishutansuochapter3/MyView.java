package com.example.zhenqiangli.androidkaifayishutansuochapter3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhenqiangli on 8/25/17.
 */

public class MyView extends View {

  public MyView(Context context) {
    super(context);
  }

  public MyView(Context context,
      @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    Bitmap bitmap = Bitmap.createBitmap(100, 100, Config.ARGB_8888);
  }
}
