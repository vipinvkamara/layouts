package com.vipin.demoss;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}


	public void myClickMethod(View v){
            Toast.makeText(this, "Service Stoped", Toast.LENGTH_LONG).show();
	      
	}
	public void mDataMethod(View v){
		
		Toast.makeText(this, "service is started", Toast.LENGTH_SHORT).show();
	}
	public void mResumeMethod(View v){
		
		Toast.makeText(this, "service is Resumed", Toast.LENGTH_LONG).show();
		
	}
	public void mLogoffMethod(View v){
		
		Toast.makeText(this, "service is LogOff", Toast.LENGTH_LONG).show();
		
	}
	

}