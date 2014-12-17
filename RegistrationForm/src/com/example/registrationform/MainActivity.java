package com.example.registrationform;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	public static String logname="none";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}


	public  void loginButtonClicked(View v){

		EditText urname=(EditText)findViewById(R.id.txtuser);
		String str1=urname.getText().toString();
		EditText urpassword=(EditText)findViewById(R.id.txtpasword);
		String pa=urpassword.getText().toString();

		if(str1.equals("vipinvk")&& (pa.equals("password")))
		{
			logname="vipin vk";
			startActivity(new Intent(this,SecondActivity.class));

		}
		else if(logname.equals("none")){

		}
		startActivity(new Intent(this,ThirdActivity.class));
		finish();
	}
	public  void onRegister(View v){

		startActivity(new Intent(this,SecondActivity.class));
		finish();
	}
}

