package com.example.albumdemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
	}


	@Override
	protected void onStart() {
		super.onStart();
		Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onResume() {
		Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
		super.onResume();
	}

	@Override
	protected void onStop() {
		Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
		super.onStop();
	}

	@Override
	protected void onRestart() {
		Toast.makeText(getApplicationContext(), "onRestart", Toast.LENGTH_SHORT).show();
		super.onRestart();
	}

	@Override
	protected void onPause() {
		Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
		super.onPause();
	}

	@Override
	protected void onDestroy() {
		Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
		super.onDestroy();
	}

	public void onshowDialogButtonClicked(View v){

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


