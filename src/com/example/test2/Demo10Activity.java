package com.example.test2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.QuickContactBadge;

public class Demo10Activity extends Activity {
	    QuickContactBadge badge;
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	    	// TODO Auto-generated method stub
	    	super.onCreate(savedInstanceState);
	    	setContentView(R.layout.demo10);
	    	badge=(QuickContactBadge)findViewById(R.id.badge);
	    	badge.assignContactFromPhone("020-88888888", false);
	    }
	    

}
