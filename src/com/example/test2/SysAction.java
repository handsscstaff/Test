package com.example.test2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SysAction extends Activity {
	final int PICK_CONTACT=0;
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.demo3);
		Button bn=(Button)findViewById(R.id.bn);
		bn.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View v) {
			      Intent intent=new Intent();
			      intent.setAction(Intent.ACTION_GET_CONTENT);
			      intent.setType("vnd.android.cursor.item/phone");
			      startActivityForResult(intent,PICK_CONTACT);
			      	}
		});
	}
    public void onActivityResult(int requestCode,int resultCode,Intent data){
    	
    }
}

