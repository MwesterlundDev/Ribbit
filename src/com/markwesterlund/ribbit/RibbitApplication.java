package com.markwesterlund.ribbit;

import android.app.Application;

import com.markwesterlund.ribbit.utils.ParseConstants;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;



public class RibbitApplication extends Application{
	
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "cWreKADCNOIMbI2mISykGGHbDLQVzHzVIa5KZpqN", "dOccrPmSbIqz2oCz3iXomIbWbXjDUpOOk7IzcZbz");
		
		
		
		ParseInstallation.getCurrentInstallation().saveInBackground();
	}
	
	public static void updateParseInstallation(ParseUser user){
		ParseInstallation installation = ParseInstallation.getCurrentInstallation();
		installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
		installation.saveInBackground();
	}
}
