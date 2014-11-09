package com.example.theapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gamescreen1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gamescreen1);
		
		Button upArrow = (Button) findViewById(R.id.upArrow);
		upArrow.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent("com.example.theapp.GAMESCREEN1"));
				
			}
		});
		Button downArrow = (Button) findViewById(R.id.downArrow);
		downArrow.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent("com.example.theapp.GAMESCREEN1"));
				
			}
		});
		Button rightArrow = (Button) findViewById(R.id.rightArrow);
		rightArrow.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent("com.example.theapp.GAMESCREEN1"));
				
			}
		});
		Button leftArrow = (Button) findViewById(R.id.leftArrow);
		leftArrow.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent("com.example.theapp.GAMESCREEN1"));
				
			}
		});
	}

}
