package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		//ParseAnalytics.trackAppOpenedInBackground(getIntent());

        ParseObject dataObject = new ParseObject("Data");
        dataObject.put("first_space","first_space");
        dataObject.put("seconf_space","second_space");
        dataObject.saveInBackground();

    }
}
