package com.ftw.hcalc;

import android.app.TabActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.*;


public class MainActivity extends TabActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		TabHost tabbh = getTabHost();
		TabSpec ts = tabbh.newTabSpec("calcp");
		ts.setIndicator(getString(R.string.calcppg));
		Intent calcppgIn = new Intent(this,CalcPPG.class);
		ts.setContent(calcppgIn);

		tabbh.addTab(ts); 
		

		ts = tabbh.newTabSpec("calcc");
		ts.setIndicator(getString(R.string.calculate_cost));
		calcppgIn = new Intent(this,Calccost.class);
		ts.setContent(calcppgIn);

		tabbh.addTab(ts);

		ts = tabbh.newTabSpec("calcw");
		ts.setIndicator(getString(R.string.calculate_weight));
		calcppgIn = new Intent(this,Calcweight.class);
		ts.setContent(calcppgIn);

		tabbh.addTab(ts);
}
}
