package com.ftw.hcalc;
import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.text.*;

public class Calcweight extends Activity
implements OnFocusChangeListener
{
	@Override 
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calcweight) ;
		
		EditText et = (EditText)findViewById(R.id.ID_ET_CWPRICE);
		et.setOnFocusChangeListener(this);
	
		et = (EditText)findViewById(R.id.ID_ET_CWPPG);
		et.setOnFocusChangeListener(this);
		//set the ppg from saved prefs
		SharedPreferences sp = getSharedPreferences(getString( R.string.prefs_filename),MODE_PRIVATE);
		if(true == sp.contains(getString(R.string.ppg_pref)))
		{
			
		}
	}

	@Override
	public void onFocusChange(View view, boolean hasFocus)
	{
		// TODO: Implement this method
		if(false == hasFocus)
		{
			TextView tv = (TextView)findViewById(R.id.ID_TV_CWNUMG);
			tv.setText("00.00");
			
		}
	}
	
	public void OnClickCalcWeight(View view)
	{
		//get price text
		// convert  to decimel
		EditText et = (EditText)findViewById(R.id.ID_ET_CWPRICE);
		String s = et.getText().toString();
		float price = 0.0f;
		if(0 != s.length())
			price = Float.valueOf(s);
		
		// get price per g text
		// convert to decimel
		et = (EditText)findViewById(R.id.ID_ET_CWPPG);
		s = et.getText().toString();
		float ppg = 0.0f;
		if(0 != s.length())
			ppg = Float.valueOf(s);
		
		// get answer/numg
		// convert to string
		// display answer
		float numg = 0.0f;
		if(0.0f != ppg)
		{
			numg = price / ppg;
		}
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		s =nf.format(numg);
		TextView tv = (TextView)findViewById(R.id.ID_TV_CWNUMG);
		tv.setText(s);
		
	}

	
}
