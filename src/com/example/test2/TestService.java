package com.example.test2;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

public class TestService extends Service {
   
    public void onCreate() {
        TestBroadcast receiver=new TestBroadcast();
        IntentFilter filter=new IntentFilter("test");
        registerReceiver(receiver, filter);
    	super.onCreate();
    }
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
	public void start(){
		Intent intent=new Intent("activityreceive");
		intent.putExtra("state", 1);
		sendBroadcast(intent);
		
	}
	public void stop(){
		Intent intent=new Intent("activityreceive");
		intent.putExtra("state", 0);
		sendBroadcast(intent);
		
	}
    public class TestBroadcast extends BroadcastReceiver{

		@Override
		public void onReceive(Context context, Intent intent) {
			int state=intent.getIntExtra("state", -1); 
			switch(state){
			case 0:
				start();
				break;
				
			}
			
			
		}
    	
    }
}
