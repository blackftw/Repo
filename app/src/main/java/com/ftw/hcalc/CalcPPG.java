package com.ftw.hcalc;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import android.icu.text.*;

public class CalcPPG extends Activity
   implements OnFocusChangeListener
{
	@Override 			
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calcppg) ;
		
		EditText et=(EditText)findViewById(R.id.ID_ET_COST);
		et.setOnFocusChangeListener(this);
		et=(EditText)findViewById(R.id.ID_ET_NUMG);
		et.setOnFocusChangeListener(this);
		//et.setOnconte
	}
	
	public void OnClickCalcPPG(View view)
	{
		//get num g
		EditText et = (EditText)findViewById(R.id.ID_ET_NUMG);
		String s = et.getText().toString();
		float numg = 0.0f;
		if(0 != s.length())
			numg = Float.valueOf(s);
		//convert to nunber
		// get price/cost
		et = (EditText)findViewById(R.id.ID_ET_COST);
		s = et.getText().toString();
		float price = 0.0f;
		if(0 != s.length())
			price = Float.valueOf(s);
		
		// convert ti nunber
		// divide for answer
		float ans = 0.0f;
		if( price != 0.0f)
		{
			ans= price/numg;
		}
		//put answer in TV
	    //s=Float.toString(ans);
		s = NumberFormat.getCurrencyInstance().format(ans);
		TextView tv_ans=(TextView)findViewById(R.id.ID_TV_PPGANSWER);
		tv_ans.setText(s);
	}

	@Override
	public void onFocusChange(View view, boolean hasFocus)
	{
		// TODO: Implement this method
		if(hasFocus == false)
		{
			// CHANGE maybe invalidated ans
			TextView tv=(TextView)findViewById(R.id.ID_TV_PPGANSWER);
			tv.setText("0.00");
			
			
		}
	}
	

	

	
}
