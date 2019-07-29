package com.example.sun_rising_tween_animation;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ImageView moon=findViewById(R.id.moon);
		moon.setVisibility(View.GONE);
		ImageView sky=findViewById(R.id.sky);



		ImageView nightback=findViewById(R.id.nightsky);
		nightback.setVisibility(View.GONE);

		
		//get the sun View
		ImageView sun = (ImageView) findViewById(R.id.sun);
		
		//get the sunrise animation
		Animation sunRise = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
		
		//apply the animation to the View
		sun.startAnimation(sunRise);
		
		//get the clock View
		ImageView clock = (ImageView) findViewById(R.id.clock);
		
		//get the clock turn animation
		Animation clockTurn = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
		
		//apply the animation to the View
		clock.startAnimation(clockTurn);
		
		//get the hour hand View
		ImageView hour = (ImageView) findViewById(R.id.hour);
		//get the hour turn animation
		Animation hourTurn = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
		//apply the animation to the View
		hour.startAnimation(hourTurn);


		nightback.startAnimation(AnimationUtils.loadAnimation(this,R.anim.night_anim));
		nightback.setVisibility(View.VISIBLE);

		moon.startAnimation(AnimationUtils.loadAnimation(this,R.anim.moonrise));
		moon.setVisibility(View.VISIBLE);



		


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {


			ImageView moon=findViewById(R.id.moon);
			moon.setVisibility(View.GONE);
			ImageView sky=findViewById(R.id.sky);


			ImageView nightback=findViewById(R.id.nightsky);
			nightback.setVisibility(View.GONE);


			//get the sun View
			ImageView sun = (ImageView) findViewById(R.id.sun);

			//get the sunrise animation
			Animation sunRise = AnimationUtils.loadAnimation(this, R.anim.sun_rise);

			//apply the animation to the View
			sun.startAnimation(sunRise);

			//get the clock View
			ImageView clock = (ImageView) findViewById(R.id.clock);

			//get the clock turn animation
			Animation clockTurn = AnimationUtils.loadAnimation(this, R.anim.clock_turn);

			//apply the animation to the View
			clock.startAnimation(clockTurn);

			//get the hour hand View
			ImageView hour = (ImageView) findViewById(R.id.hour);
			//get the hour turn animation
			Animation hourTurn = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
			//apply the animation to the View
			hour.startAnimation(hourTurn);


			nightback.startAnimation(AnimationUtils.loadAnimation(this,R.anim.night_anim));
			nightback.setVisibility(View.VISIBLE);

			moon.startAnimation(AnimationUtils.loadAnimation(this,R.anim.moonrise));
			moon.setVisibility(View.VISIBLE);




		}
		return super.onOptionsItemSelected(item);
	}
}
