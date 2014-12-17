package com.example.indent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view);
		((TextView)findViewById(R.id.activity_view_txtview_login_status)).setText(LoginActivity.loggedInUser);
	}
}
