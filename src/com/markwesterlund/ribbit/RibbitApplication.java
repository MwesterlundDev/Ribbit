package com.markwesterlund.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;



public class RibbitApplication extends Application{
	
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "cWreKADCNOIMbI2mISykGGHbDLQVzHzVIa5KZpqN", "dOccrPmSbIqz2oCz3iXomIbWbXjDUpOOk7IzcZbz");
		
	
	}
}
