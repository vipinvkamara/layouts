package com.example.indent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);


	}
	public void cancelButtonClicked(View v){
		startActivity(new Intent(this,LoginActivity.class));
		finish();
	}
	public void saveButtonClicked(View v) {
		EditText ed1= (EditText)findViewById(R.id.editText4);
		String s1=ed1.getText().toString();

		Toast.makeText(getApplicationContext(), "Data is saved\n"+s1,Toast.LENGTH_LONG).show();


	}

}
