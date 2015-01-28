package com.example.test2;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Demo2Activity extends Activity {
           int state=0;
           Button btn;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.demo2);
		ActivityBroadcast receiver =new ActivityBroadcast();
		IntentFilter filter=new IntentFilter("activityreceive");
		registerReceiver(receiver, filter);
		Intent service=new Intent("");
		startService(service);
		btn=(Button)findViewById(R.id.btn);
	    btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			switch(state){
			case 0:
				Intent intent=new Intent("test");
				intent.putExtra("state", state);
			    sendBroadcast(intent);
			    state=1;
				break;
			}
				
			}
		});
	   
}
	 public class ActivityBroadcast extends BroadcastReceiver{

		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO Auto-generated method stub
			state=intent.getIntExtra("state", -1);
			switch(state){
			case 1:
				btn.setText("stop");
			    break;
			case 0:
				btn.setText("start");
				break;
			}
			
			
			
		}
		 
	 }
}
