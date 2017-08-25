package com.example.zhenqiangli.androidkaifayishutansuochapter3;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  protected void onResume() {
    super.onResume();
    View v = findViewById(R.id.view);
    ObjectAnimator.ofFloat(v, "translationX", 0, 100).setDuration(1000).start();
    new Thread(()->{
      try {
        Thread.sleep(1000);
        v.scrollBy(0, 100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }).start();
  }

  private void draw() {
    Bitmap bitmap = Bitmap.createBitmap(100, 100, Config.ARGB_8888);
    Canvas canvas = new Canvas(bitmap);
  }
}
