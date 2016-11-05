package com.example.manubhangu.faceapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Drawing extends AppCompatActivity {
    ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);

        iv = (ImageView) findViewById(R.id.imageView);
        Intent intent = getIntent();
        Bitmap bp = intent.getParcelableExtra("bitmapimage");
        iv.setImageBitmap(bp);
    }
}
