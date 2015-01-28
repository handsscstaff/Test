package com.example.test2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DemoActivity extends Activity {
	
	     Intent service;
	     ServiceConnection conn=new ServiceConnection() {
			
			@Override
			public void onServiceDisconnected(ComponentName name) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onServiceConnected(ComponentName name, IBinder service) {
				Log.i("Activity","onServiceConnected");
				MyService.MyBinder binder=(MyService.MyBinder)service ;
				Toast.makeText(DemoActivity.this, binder.getcount()+"", 2000).show();
				
				
			}
		};
	     	protected void onCreate(Bundle savedInstanceState) {
      			// TODO Auto-generated method stub
      			super.onCreate(savedInstanceState);
      			setContentView(R.layout.demo);
      			((Button)findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) { 
						 service =new Intent("intent.service.MYSERVICE");
						startService(service);
						
						
					}
				});
              ((Button)findViewById(R.id.btn2)).setOnClickListener(new View.OnClickListener() {
					
				
					public void onClick(View v) {
						stopService(service);
						
					}
				});
              ((Button)findViewById(R.id.btn3)).setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
					   service =new Intent("intent.service.MYSERVICE");
						bindService(service, conn, BIND_AUTO_CREATE);
						
					}
				});
              ((Button)findViewById(R.id.btn4)).setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
					  unbindService(conn);
						
					}
				});
      		   	     		
	       }

}
