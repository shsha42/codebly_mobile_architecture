
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		_____
	 *	@date 		Thursday 25th of July 2024 11:46:53 AM
	 *	@title 		 
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.xd
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class ______activity extends Activity {

	
	private View _bg________;
	private ImageView ___5;
	private View _____84;
	private ImageView ____130;
	private TextView ____;
	private View ____39;
	private TextView _____ek1;
	private TextView dhdmsrud;
	private TextView _x;
	private TextView ___;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout._____);

		
		_bg________ = (View) findViewById(R.id._bg________);
		___5 = (ImageView) findViewById(R.id.___5);
		_____84 = (View) findViewById(R.id._____84);
		____130 = (ImageView) findViewById(R.id.____130);
		____ = (TextView) findViewById(R.id.____);
		____39 = (View) findViewById(R.id.____39);
		_____ek1 = (TextView) findViewById(R.id._____ek1);
		dhdmsrud = (TextView) findViewById(R.id.dhdmsrud);
		_x = (TextView) findViewById(R.id._x);
		___ = (TextView) findViewById(R.id.___);
	
		
		_x.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), ____activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	