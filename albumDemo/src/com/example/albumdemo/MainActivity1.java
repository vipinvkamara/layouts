package com.example.albumdemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
	}
	protected void onStart(){
		super.onStart();
		Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();

	}
	protected void onResume(){
		super.onResume();
		Toast.makeText(this, "onResme", Toast.LENGTH_SHORT).show();

	}
	protected void onPause(){
		super.onPause();
		Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();

	}
	protected void onStop(){
		super.onStop();
		Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();

	}
	protected void onRestart(){
		super.onRestart();
		Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();

	}
	protected void onDestroy(){
		super.onDestroy();
		Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();

	}
	public void onShowButtonClick(View v){
		new AlertDialog.Builder(this)
		.setTitle("Dialog Title")
		.setMessage("Message for Dialog")
		//YES Button
		.setPositiveButton("YES", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) { 
				// continue with delete
				Toast.makeText(getApplicationContext(), "YES Clicked in AlertDialog", Toast.LENGTH_SHORT).show();

			}
		})
		//NO BUtton
		.setNegativeButton("NO", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) { 
				// do nothing
				Toast.makeText(getApplicationContext(), "NO Clicked in AlertDialog", Toast.LENGTH_SHORT).show();

			}
		})
		//Icon For the dialog
		.setIcon(android.R.drawable.ic_dialog_alert)

		//Show the Dialog similar to toast
		.show();
	}

}