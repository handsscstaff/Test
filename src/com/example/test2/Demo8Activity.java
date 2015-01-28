package com.example.test2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class Demo8Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.demo8);
		Button button1=(Button)findViewById(R.id.button1);
		Button button2=(Button)findViewById(R.id.button2);
		TranslateAnimation animation =new TranslateAnimation(0, 150, 0, 0);
		animation.setRepeatCount(30);
		animation.setDuration(2000);
		button1.setAnimation(animation);
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				         new Thread(new Runnable(){
					     public void run(){
						    try{ 
							   Thread.sleep(50000);
						       }
						     catch(InterruptedException e)
						     {
							   e.printStackTrace(); 
						     }           
						                   }
				                                    
				                                    }).start();
			}  
		                  });
		
	}

}
