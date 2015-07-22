package org.example.mymap;



import org.example.mymap.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Hospitals extends Activity implements OnClickListener
{
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hospitalselect);
		Spinner localSpinner=(Spinner)findViewById(R.id.hospital_spinner);
		Bundle bundle = this.getIntent().getExtras();
		String param1 = bundle.getString("param1");
		if(param1.equals("Vijaynagar"))
				{
		ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this, R.array.vijaynagar, R.layout.spinnerhospital);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		localSpinner.setAdapter(adapter);
		localSpinner.getBackground().setAlpha(200);
				}
		if(param1.equals("Jayanagar"))
		{
			ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this, R.array.jaynagar, R.layout.spinnerhospital);
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			localSpinner.setAdapter(adapter);
			localSpinner.getBackground().setAlpha(200);	
		}
		
		if(param1.equals("Malleshwaram"))
		{
			ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this, R.array.malleshwaram, R.layout.spinnerhospital);
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			localSpinner.setAdapter(adapter);
			localSpinner.getBackground().setAlpha(200);	
		}
		
		if(param1.equals("Koramangala"))
		{
			ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this, R.array.koramangala, R.layout.spinnerhospital);
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			localSpinner.setAdapter(adapter);
			localSpinner.getBackground().setAlpha(200);	
		}
		
		if(param1.equals("Indiranagar"))
		{
			ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this, R.array.indiranagar, R.layout.spinnerhospital);
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			localSpinner.setAdapter(adapter);
			localSpinner.getBackground().setAlpha(200);	
		}
		
		if(param1.equals("J P Nagar"))
		{
			ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this, R.array.jpnagar, R.layout.spinnerhospital);
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			localSpinner.setAdapter(adapter);
			localSpinner.getBackground().setAlpha(200);	
		}
		
		if(param1.equals("Hebbal"))
		{
			ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this, R.array.hebbal, R.layout.spinnerhospital);
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			localSpinner.setAdapter(adapter);
			localSpinner.getBackground().setAlpha(200);	
		}
		
		if(param1.equals("Yelahanka"))
		{
			ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this, R.array.yelahanka, R.layout.spinnerhospital);
			adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			localSpinner.setAdapter(adapter);
			localSpinner.getBackground().setAlpha(200);	
		}
		
		
						
		View submitButton = findViewById(R.id.submitbutton2);
		submitButton.setOnClickListener(this);
		submitButton.getBackground().setAlpha(230);
	}
	public void onClick(View v)
	{
		switch (v.getId()) 
		{
		
			case R.id.submitbutton2:
			
			Intent i=new Intent(this, HospitalInfo.class);
			Spinner localSpinner=(Spinner)findViewById(R.id.hospital_spinner);
			String strval2 = localSpinner.getSelectedItem().toString();
			Bundle bundle2 = new Bundle();
	        bundle2.putString("param2", strval2);
			i.putExtras(bundle2);
			startActivity(i);
			break;
		}
	}
}
