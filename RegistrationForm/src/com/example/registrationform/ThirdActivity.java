package com.example.registrationform;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_status);
		TextView tv=(TextView)findViewById(R.id.activity_view_txtview_login_status);
		tv.setText(MainActivity.logname);
	}
	public void onBack(View v) throws Throwable{
		startActivity(new Intent(this,MainActivity.class));
		finish();	}
}

