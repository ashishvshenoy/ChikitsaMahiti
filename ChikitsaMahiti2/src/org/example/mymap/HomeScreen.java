package org.example.mymap;



import org.example.mymap.R;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class HomeScreen extends Activity implements OnClickListener{
    
	
	@Override
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		View aroundYou = findViewById(R.id.around_you_button);
		aroundYou.setOnClickListener(this);
		aroundYou.getBackground().setAlpha(200);
		View exitButton = findViewById(R.id.exit_button);
		exitButton.setOnClickListener(this);
		exitButton.getBackground().setAlpha(200);
		View aboutButton = findViewById(R.id.about_button);
		aboutButton.setOnClickListener(this);
		aboutButton.getBackground().setAlpha(200);
	}
	
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.exit_button:
			finish();
			break;
		case R.id.around_you_button:
			Intent i1 = new Intent(this, AroundYou.class);
	        startActivity(i1);
	        break;
		case R.id.about_button:
			Intent i2 = new Intent(this, About.class);
	        startActivity(i2);
	        break;
		}
	}
}