package org.example.mymap;

import org.example.mymap.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class HospitalInfo extends Activity implements OnClickListener {
	public static String address, phoneno, lat, longitude,param2;
	
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospitalinfo);
        Bundle bundle = this.getIntent().getExtras();
		param2 = bundle.getString("param2");
        if(param2.equals("Acura Speciality Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "435, 6th Block, 18th Main, Koramangala, Bengaluru, Karnataka 560095";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08025506868";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12931622";
            longitude = "77619824";
        }
        if(param2.equals("St. Johns Medical Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "Hosur Road, Koramangala 2 Block, Koramangala, Bangalore";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08022065000";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12943668";
            longitude = "77608967";
        }
        if(param2.equals("St. Johns Medical College and Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "John Nagar, Koramangala, Bengaluru ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08025536514";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12931622";
            longitude = "77619824";
        }
        if(param2.equals("Devi Eye Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "434, 18th Main Rd, Koramangala 6 Block, Koramangala, Bengaluru";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08025535514";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12939611";
            longitude = "77621756";
        }
        if(param2.equals("Nova Medical Centers"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "Opus, 1st A Cross, 5 Block Koramangala, Koramangala, Bengaluru";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08043485555";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12934069";
            longitude = "77621412";
        }
        if(param2.equals("The Ladys Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "No. 25, 46th Cross,, 5th Block, Jayanagar, Bangalore ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08042659999";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "1291648";
            longitude = "77583604";
        }
        if(param2.equals("Ramakrishna Nursing Home"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "Jayanagar 3rd Block, Byrasandra, Bangalore  ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08041204040";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12935094";
            longitude = "77580643";
        }
        if(param2.equals("The Bangalore Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "Rashtriya Vidyalaya Rd, Basavangudi, Bengaluru   ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08041187600";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12941075";
            longitude = "77580106";
        }
        if(param2.equals("Nimhans Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "Dharmaram College Post Office, Of Hosur Road, Hosur, S G Palya, S G Palya, Bengaluru ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08026995000";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12996529";
            longitude = "77577209";
        }
        if(param2.equals("Rajiv Gandhi University of Health Sciences"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "Jayanagar, 4th T Block Bengaluru, Karnataka ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08026961933";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12938377";
            longitude = "77586114";
        }
        
        if(param2.equals("Manipal North Side Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = " Malleshwaram, Bangalore  ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08023460468";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "13005561";
            longitude = "77562618";
        }
        if(param2.equals("Jupiter Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "28, 7th Main, 9th cross, Malleshwaram, Bengaluru";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08023313355";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "13000585";
            longitude = "77566116";
        }
        if(param2.equals("Leela Nursing Home"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "Margosa Rd, Malleshwaram, Bengaluru, Karnataka";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08023311134";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "13000794";
            longitude = "77569141";
        }
        if(param2.equals("Columbia Asia Referral Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "26/1, Brigade Gateway Enclave, Malleshwaram West, Bengaluru";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08039898969";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "13011917";
            longitude = "77564335";
        }
        if(param2.equals("Vagus Super Speciality Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "18th cross Rd, Malleshwaram";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08023082900";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "13008969";
            longitude = "77568562";
        }
        if(param2.equals("Sree Raja Rajeshwari Medical College and Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "3411, Rpc Layout, Service Road, Vijaya Nagar, Service Road, Bengaluru ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08023398258";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12966399";
            longitude = "77535882";
        }
        if(param2.equals("Hospital Sharavathi Pvt. Ltd."))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "Building No. 1133/F, 30 Feet Service Road, RPC Layout, Vijayanagar, Bengaluru";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08023300717";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12960356";
            longitude = "77533264";
        }
        if(param2.equals("A. M. Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "20/1, 2nd Cross, Chandra Layout Main Road, Widia Layout, Vijaya Nagar, Bengaluru -080 23392851";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12974408";
            longitude = "77535753";
        }
        if(param2.equals("Gurushree Hi-tech Multi Speciality Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = "#1558, Chandra Layout, Bengaluru";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08023392641";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12956069";
            longitude = "77529445";
        }
        if(param2.equals("Gayathri Hospital Pvt"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText(param2);
        	address = " Buil91, Magadi Chord Road, Vijaya Nagar, Bengaluru";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08023352085";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12968365";
            longitude = "77536333";
        }
        
        if(param2.equals("Ashwini Hospitals"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Ashwini Hospitals");
        	address = "   B B Road, Yelahanka, Yelahanka, Bengaluru ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08028563877 ";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "13137879";
            longitude = "77603205";
        }
        
        if(param2.equals("Hospital Chaitanya"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Hospital Chaitanya");
        	address = "  Yelhanka, Bengaluru  ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08028562514 ";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "13135445";
            longitude = "77589118";
        }
        
        if(param2.equals("Sri Jayalakshmi Nursing Home"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Sri Jayalakshmi Nursing Home");
        	address = "   Hospital Road, Yelahanka , Bangalore- 560064 , Karnataka  ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08028910530 ";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "13100472";
            longitude = "77594386";
        }
        
        if(param2.equals("Sri Maruthi Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Sri Maruthi Hospital");
        	address = "   50, Kondappa Garden Maruthinagar, Yelahanka , Bangalore- 560064 , Karnataka  ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08028462526  ";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "13138746";
            longitude = "77603517";
        }
        
        if(param2.equals("Columbia Asia Medical Centre"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Columbia Asia Medical Centre");
        	address = "   Kirloskar Business Park, Bellary Road, Hebbal , Bangalore- 560024 , Karnataka ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08041791000 ";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "13050947";
            longitude = "77593668";
        }
        
        if(param2.equals("Bangalore Baptist Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Bangalore Baptist Hospital");
        	address = "   Bellary Road, Hebbal , Bangalore- 560024 , Karnataka ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08023330323 ";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "13035849";
            longitude = "77589988";
        }
        
        if(param2.equals("Lakshmi Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Lakshmi Hospital");
        	address = "   402, 2nd Cross, Judges Colony, Ganga Nagar , Bangalore- 560032 , Karnataka ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08023335184 ";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "13024884";
            longitude = "77592042";
        }
        
        if(param2.equals("Northside Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Northside Hospital");
        	address = "   8, 60 Feet Road, G-Block, Sahakara Nagar , Bangalore- 560092 , Karnataka ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08023620844 ";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "13063656";
            longitude = "77590588";
        }
        
        if(param2.equals("Green City Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Green City Hospital");
        	address = "  #726 17th Cross 6th Phase, J.P Nagar , Bangalore- 560078 , Karnataka";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08026536222";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12902334";
            longitude = "7758503";
        }
        
        if(param2.equals("TR Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("TR Hospital");
        	address = "  Kothanur Dinne Main Road, 8th Phase, J.P Nagar , Bangalore- 560078 , Karnataka ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08026536222";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "1294917";
            longitude = "77588806";
        }
        
        if(param2.equals("RR Hospital and Trauma Centre"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("RR Hospital & Trauma Centre");
        	address = "   11/2, 8th Cross, Gangadhar Nagar, J.P Nagar , Bangalore- 560078 , Karnataka  ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08026718785";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12917826";
            longitude = "77600005";
        }
        
        if(param2.equals("Chirag Hospital and Institute Of Procology"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Chirag Hospital & Institute Of Procology");
        	address = "   1635, 17th Main, J.P Nagar 2nd Phase , Bangalore- 560078 , Karnataka   ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08026597027";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12917568";
            longitude = "77590581";
        }
        
        if(param2.equals("Divakars Global Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Divakars Global Hospital");
        	address = "    220, 9th Cross, J.P Nagar 2nd Phase , Bangalore- 560078 , Karnataka    ";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08041209660";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12910896";
            longitude = "77591329";
        }
        
        if(param2.equals("Lotus Diagnostic Center"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Lotus Diagnostic Center");
        	address = "  Chinmaya Mission Hospital Rd, Indira Nagar I Stage, Hoysala Nagar, Bangalore";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel:08025284000";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12978811";
            longitude = "77644124";
        }
        
        if(param2.equals("Chinmaya Mission Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Chinmaya Mission Hospital");
        	address = "  Chinmaya Mission Hospital Rd, Indira Nagar I Stage, Hoysala Nagar, Bangalore";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel: 08025282207";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12978811";
            longitude = "77644124";
        }
        
        if(param2.equals("Axon Speciality Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Axon Speciality Hospital");
        	address = "  6th Main, Hal 2nd Stage, Indiranagar, Bengaluru, Karnataka 560038";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel: 08043346333";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12974349";
            longitude = "77637181";
        }
        
        if(param2.equals("Lohitha Hospital"))
        {
        	TextView text1 = (TextView) findViewById(R.id.textView4);
        	text1.setText("Lohitha Hospital");
        	address = "  685/2-1, 16th D Main, HAL 2nd Stage";
        	TextView text2 = (TextView) findViewById(R.id.textView3); 
            text2.setText(address);
            phoneno="tel: 08025277697";
            TextView text3 = (TextView) findViewById(R.id.textView5); 
            text3.setText(phoneno);
            lat = "12964885";
            longitude = "77644424";
        }
        
        
        View callButton = findViewById(R.id.call_button);
		callButton.setOnClickListener(this);
		callButton.getBackground().setAlpha(200);
		
		 View mapButton = findViewById(R.id.map_button);
		 mapButton.setOnClickListener(this);
		 mapButton.getBackground().setAlpha(200);
	        
        
    }
    public void onClick(View v) {
		switch (v.getId()) {
		case R.id.map_button:
			Bundle bundle3 = new Bundle();
	        bundle3.putString("lat", lat);
	        bundle3.putString("longitude", longitude);
	        bundle3.putString("name", param2);
	        bundle3.putString("address", address);
	        bundle3.putString("phone", phoneno);
	        Intent i = new Intent(this, GMapsActivity.class);
			i.putExtras(bundle3);
			startActivity(i);
			break;
		case R.id.call_button:
			
			Intent sIntent = new Intent(Intent.ACTION_CALL, Uri.parse(phoneno));
				    startActivity(sIntent);
	        break;
		
		
		}
	}
}