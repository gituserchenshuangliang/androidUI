package com.cls.demo;

import com.example.androidui.R;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

/**
 * UI学习
 * @author Cherry
 * @date  2019年6月6日
 */
public class ActivityTwo extends BaseActivity {
	private ImageView iv;
	private ProgressBar pb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_two);
		this.createListenButton(R.id.B);
		this.createListenButton(R.id.C);
		this.createListenButton(R.id.E);
		this.createListenButton(R.id.F);
		this.createListenButton(R.id.G);
		iv = (ImageView) findViewById(R.id.A);
		pb = (ProgressBar) findViewById(R.id.D);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.B:
			iv.setImageResource(R.drawable.chen);
			break;
		case R.id.C:
			finish();
			break;
		case R.id.E:
			int pro = pb.getProgress();
			pro = pro +10;
			pb.setProgress(pro);
			break;
		case R.id.F:
			createDialog();
			break;
		case R.id.G:
			createProgressDialog();
			break;
		default:
			break;
		}
	}
	
	/*
	 * 创建对话框
	 * 对话框能屏蔽其他活动，一般显示重要信息。
	 */
	public void createDialog(){
		AlertDialog.Builder ab = new AlertDialog.Builder(ActivityTwo.this);
		ab.setTitle("对话框");
		ab.setMessage("只有重要的信息采用对话框！");
		ab.setCancelable(false);
		
		ab.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				
			}
		});
		
		ab.setNegativeButton("取消",new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				
			}
		});
		
		ab.show();
	}
	
	/*
	 * 创建进度条对话框
	 */
	public void createProgressDialog(){
		ProgressDialog pd = new ProgressDialog(ActivityTwo.this);
		pd.setTitle("进度条对话框");
		pd.setMessage("只有重要的信息采用对话框！");
		pd.setCancelable(false);
		pd.show();
	}
}
