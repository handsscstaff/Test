package com.example.test2;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
        static String TAG="MyService";
	    @Override
	    public void onCreate() {
	    Log.i(TAG,"onCreate");
	    super.onCreate();
	    }
	    @Override
	    public int onStartCommand(Intent intent, int flags, int startId) {
	    	 Log.i(TAG,"onStartCommand");
	         return super.onStartCommand(intent, flags, startId);
	    }
	    @Override
	    public void onDestroy() {
	    	 Log.i(TAG,"onDestroy");
	    super.onDestroy();
	    }
	   
	public IBinder onBind(Intent intent) {
		 Log.i(TAG,"onBind");
		return new MyBinder();
	}
	public class MyBinder extends Binder{
		public int getcount(){
			return 10;
			
		}
		
	}

}
