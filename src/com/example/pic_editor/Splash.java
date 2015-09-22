package com.example.pic_editor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class Splash extends ActionBarActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		Thread tr = new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					sleep(3000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent i = new Intent("android.intent.action.MAINACTIVITY");
					startActivity(i);
				}
				super.run();
			}
			
		};
		tr.start();
		
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		finish();
		super.onStop();
	}
}
