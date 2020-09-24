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
import reader.PropertyReader;

public class ContactClass extends SetUp {
	Properties Location_path,Data_path;

	public void contact() throws InterruptedException {
		Location_path=PropertyReader.readProperty(Constant.LOCATOR_FILE_PATH);
		Data_path=PropertyReader.readProperty(Constant.DATA_FILE_PATH);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		HelperClass.elementClick(driver, Location_path.getProperty("ContactLink"));
		HelperClass.ElementSelectorSendKeys(driver, Location_path.getProperty("Recipient_Email"), Data_path.getProperty("Recipient_Mail"));
		HelperClass.ElementSelectorSendKeys(driver, Location_path.getProperty("Recipient_name"), Data_path.getProperty("Recipient_Name"));
		HelperClass.sendKeyById(driver, Location_path.getProperty("Messageid"), Data_path.getProperty("Message"));

		HelperClass.elementClick(driver, Location_path.getProperty("SendMessage"));

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		

	}

}
