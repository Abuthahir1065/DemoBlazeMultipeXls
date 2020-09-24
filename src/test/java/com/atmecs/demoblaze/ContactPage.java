package com.atmecs.demoblaze;
import org.testng.annotations.Test;

import browser.SetUp;
import pageActions.ContactClass;


public class ContactPage extends SetUp {
	@Test(priority=3)

	public void contactMethod() throws InterruptedException {
		ContactClass contact=new ContactClass();
		contact.contact();
	

	}

}
