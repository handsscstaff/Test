package com.example.test2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class Demo4Activity extends Activity {
	RadioGroup rg;
	TextView show;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.demo4);
		rg=(RadioGroup)findViewById(R.id.rg);
		show=(TextView)findViewById(R.id.show);
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				String tip=checkedId==R.id.male?"您的性别是男人":"您的性别是女人";
				show.setText(tip);
				
			}
		});
	}

}
