package org.example.mymap;

import org.example.mymap.R;

import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AroundYou extends Activity implements OnClickListener
{
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.areaselect);
		Spinner localSpinner=(Spinner)findViewById(R.id.area_spinner);
		ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this, R.array.area_name, R.layout.spinnerarea);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		localSpinner.setAdapter(adapter);
		localSpinner.getBackground().setAlpha(200);
		
				
		View continueButton = findViewById(R.id.submitbutton);
		continueButton.setOnClickListener(this);
		continueButton.getBackground().setAlpha(230);
	}
	
	public void onClick(View v)
	{
		switch (v.getId()) 
		{
		case R.id.submitbutton:
			
			Spinner localSpinner=(Spinner)findViewById(R.id.area_spinner);
			String strval = localSpinner.getSelectedItem().toString();
			Bundle bundle = new Bundle();
	        bundle.putString("param1", strval);
	       
			Intent i=new Intent(this, Hospitals.class);
			i.putExtras(bundle);
			startActivity(i);
	        
			break;
		}
	}
}
