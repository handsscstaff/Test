package com.example.test2;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Chronometer.OnChronometerTickListener;

public class Demo6Activity extends Activity {
	Chronometer ch;
	Button start;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.demo6);
	
		
		start.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ch.setBase(SystemClock.elapsedRealtime());
				ch.start();
				start.setEnabled(false);
				
			}
		});
		ch.setOnChronometerTickListener(new OnChronometerTickListener() {
			
			@Override
			public void onChronometerTick(Chronometer chronometer) {
				if(SystemClock.elapsedRealtime()-ch.getBase()>20*1000)
				{
					ch.stop();
					start.setEnabled(true);
				}
				
			}
		});
	}

}
