package com.example.test2;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Demo11Activity extends Activity {
	    ActionBar actionBar;
	   
	    protected void onCreate(Bundle savedInstanceState) {
	    
	    	super.onCreate(savedInstanceState);
	    	setContentView(R.layout.demo11);
	    	actionBar=getActionBar();
	    }
	    public void showActionBar(View source){
	    	actionBar.show();
	    }
	    public void hideActionBar(View source){
	    	actionBar.hide();
	    }

}
