package com.fine.nssali;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.fine.nssali.R;

public class SingleContactActivity  extends Activity {
	
	// JSON node keys
	private static final String TAG_NAME = "name";
	private static final String TAG_EMAIL = "email";
	private static final String TAG_PHONE_MOBILE = "mobile";
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        // getting intent data
        Intent in = getIntent();
        
        // Get JSON values from previous intent
        String name = in.getStringExtra(TAG_NAME);
        String email = in.getStringExtra(TAG_EMAIL);
        String mobile = in.getStringExtra(TAG_PHONE_MOBILE);
        
        
        
        
    }
}
