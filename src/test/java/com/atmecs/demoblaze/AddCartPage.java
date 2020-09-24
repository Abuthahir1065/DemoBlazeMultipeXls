package com.atmecs.demoblaze;




import org.testng.annotations.Test;

import browser.SetUp;
import pageActions.AddCartClass;


public class AddCartPage extends SetUp {
	@Test(priority=3)

		public void addCartMethod() throws InterruptedException {
		
		AddCartClass cart=new AddCartClass();
		cart.addCart();

		
	}

}
