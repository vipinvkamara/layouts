package com.example.registrationform;

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
		setContentView(R.layout.activity_form);

	}
	public void onshowtxt(View v) {

		EditText ed= (EditText)findViewById(R.id.edittxt1);
		EditText em= (EditText)findViewById(R.id.edittxt2);

		String str_ed=ed.getText().toString();
		String str_em=em.getText().toString();

		if(str_ed.equals("")||str_em.equals("")){
			Toast.makeText(this, "Please enter all fields.",Toast.LENGTH_SHORT).show();
			if(str_ed.equals("")){
				ed.setError("Required");
			}
			if(str_em.equals("")){
				em.setError("Required");
			}
			return;
		}else
		{
			Toast.makeText(this, "Entered Data is \n"+str_ed+"\n"+str_em,Toast.LENGTH_LONG).show();

		}

	}

	public void onBack(View v){
		startActivity(new Intent(this,MainActivity.class));
		finish();
	}



}

