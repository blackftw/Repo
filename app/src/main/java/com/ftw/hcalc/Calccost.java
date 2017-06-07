package com.ftw.hcalc;
import android.app.*;
import android.os.*;
import android.view.View.*;
import android.widget.*;
import android.view.*;
import java.text.*;

//TEST CHANGE
public class Calccost extends Activity
implements OnFocusChangeListener
{
	int a = 5;
	@Override 
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calccost) ;
		
		EditText et= (EditText)findViewById(R.id.ID_ET_CCNUMG);
		et.setOnFocusChangeListener(this);
		
		et = (EditText)findViewById(R.id.ID_ET_CCPPG);
		et.setOnFocusChangeListener(this); 
	}
	@Override
	public void onFocusChange(View view, boolean hasFocus)
	{
		// TODO: Im plement this method
		if(false == hasFocus)
		{
			TextView et=(TextView)findViewById(R.id.ID_TV_TOTALPRICE);
			et.setText("00.00");
		}
	}
	public void OnClickCalcCost(View view)
	{
		EditText et=(EditText)findViewById(R.id.ID_ET_CCNUMG);
		String s = et.getText().toString();
		float numg = 0.0f;
		if(0 != s.length())
			numg = Float.valueOf(s);
		
		et = (EditText)findViewById(R.id.ID_ET_CCPPG);
		s = et.getText().toString();
		float ppg = 0.0f;
		if(0 != s.length())
			ppg = Float.valueOf(s);
		float ans = numg * ppg;
		
		//s = Float.toString(ans);
		s = NumberFormat.getCurrencyInstance().format(ans);
		
		TextView tv = (TextView)findViewById(R.id.ID_TV_TOTALPRICE);
		tv.setText(s);
		
	}

	
}
