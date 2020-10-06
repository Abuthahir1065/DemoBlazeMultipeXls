package pageActions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browser.SetUp;
import constant.Constant;
import helper.HelperClass;
import reader.ContactDataProvider;
import reader.PropertyReader;
import reader.SignInDataProvider;

public class ContactClass extends SetUp {
	Properties Location_path;
	@Test(dataProvider = "Contact", dataProviderClass = ContactDataProvider.class)

	public void contact(String mail,String name,String message) throws InterruptedException {
		Location_path=PropertyReader.readProperty(Constant.LOCATOR_PATH);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		HelperClass.elementClick(driver, Location_path.getProperty("ContactLink"));
		HelperClass.ElementSelectorSendKeys(driver, Location_path.getProperty("Recipient_Email"), mail);
		HelperClass.ElementSelectorSendKeys(driver, Location_path.getProperty("Recipient_name"),name);
		HelperClass.sendKeyById(driver, Location_path.getProperty("Messageid"),message);

		HelperClass.elementClick(driver, Location_path.getProperty("SendMessage"));

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		

	}

}
