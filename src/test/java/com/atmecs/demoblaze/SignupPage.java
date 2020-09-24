package com.atmecs.demoblaze;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import browser.SetUp;
import pageActions.SignupClass;

public class SignupPage extends SetUp {
	@Test(priority=1)

		
	public void signUpMethod() throws FileNotFoundException, IOException
	{

		SignupClass sign=new SignupClass();
		sign.signUp();
		

        
	}
	

}
