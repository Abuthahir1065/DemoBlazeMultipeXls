package com.atmecs.demoblaze;

import java.io.IOException;
import org.testng.annotations.Test;

import browser.SetUp;
import pageActions.LoginClass;

public class LoginPage extends SetUp {
	
	
	
	
	@Test(priority=2)

	public void loginPageMethod() throws InterruptedException, IOException {
		LoginClass log=new LoginClass();
		log.login();

	}
	

}
