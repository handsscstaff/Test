package com.example.test2;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Demo7Activity extends Activity {
	int[] images=new int[]{
			R.drawable.lijiang,
			R.drawable.qiao,
			R.drawable.shuangta,
			R.drawable.shui,
			R.drawable.xiangbi,
	};
	int currentImg=2;
	private int alpha=255;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.demo7);
		final Button plus=(Button)findViewById(R.id.plus);
		final Button minus=(Button)findViewById(R.id.minus);
		final ImageView image1=(ImageView)findViewById(R.id.image1);
		final ImageView image2=(ImageView)findViewById(R.id.image2);
		final Button next=(Button)findViewById(R.id.next);
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				image1.setImageResource(images[++currentImg%images.length]);
			
				}
		});
		OnClickListener listener =new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			if(v==plus){
				alpha+=20;
			}
			if(v==minus){
				alpha-=20;
			}
			if(alpha>=250){
				alpha=255;
			}
			if(alpha<=0){
				alpha=0;
			}
			image1.setAlpha(alpha);
			
			}
		};
		plus.setOnClickListener(listener);
		minus.setOnClickListener(listener);
		image1.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
			    BitmapDrawable bitmapDrawable=(BitmapDrawable)image1.getDrawable();
			    Bitmap bitmap=bitmapDrawable.getBitmap();
			    double scale=bitmap.getWidth()/320.0;
			    int x=(int)(event.getX()*scale);
			    int y=(int)(event.getY()*scale);
			    if(x+120>bitmap.getWidth())
			    {
			    	x=bitmap.getWidth()-120;
			    }
			    if(y+120>bitmap.getHeight())
			    {
			    	y=bitmap.getHeight()-120;
			    }
			    image2.setImageBitmap(Bitmap.createBitmap(bitmap, x, y,120,120));
			    image2.setAlpha(alpha);
				return false;
			}
		});
		
		
		
	}

}
