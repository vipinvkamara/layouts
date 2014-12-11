package com.vipin.example1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main1);

	}

	public void mclickethord(View v)
	{
		Toast.makeText(this,"Data is submited", Toast.LENGTH_LONG).show();

	}

	public void mcancelethord(View v)
	{
		Toast.makeText(this,"Data is cancel", Toast.LENGTH_LONG).show();
	}

}