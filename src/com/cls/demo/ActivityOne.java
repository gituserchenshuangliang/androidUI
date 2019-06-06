package com.cls.demo;

import com.example.androidui.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * UI学习
 * @author Cherry
 * @date  2019年6月6日
 */
public class ActivityOne extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_one);
		
		Button btn = (Button) findViewById(R.id.B);
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				TextView tv = (TextView) findViewById(R.id.A);
				EditText et = (EditText) findViewById(R.id.C);
				String contect = et.getText().toString();
				if(null != contect && contect.length() != 0){
					tv.append(contect+"\n");
				}
				et.setText(null);
			}
		});
		Button btn2 = (Button) findViewById(R.id.B_a);		
		btn2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				TextView tv = (TextView) findViewById(R.id.A);
				EditText et = (EditText) findViewById(R.id.C);
				tv.setText(null);
				et.setText(null);
			}
		});
		
		Button btn3 = (Button) findViewById(R.id.D);		
		btn3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent ints = new Intent(ActivityOne.this,ActivityTwo.class);
				startActivity(ints);
			}
		});
	}
}
