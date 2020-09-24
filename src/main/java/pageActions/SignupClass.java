package pageActions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class SignupClass extends SetUp {
	
	
	Properties Location_path,Data_path;

	public void signUp() throws FileNotFoundException, IOException
	{    

	
		Location_path=PropertyReader.readProperty(Constant.LOCATOR_FILE_PATH);
		Data_path=PropertyReader.readProperty(Constant.DATA_FILE_PATH);
       
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Location_path.getProperty("SignIn_Id"))));
		HelperClass.selectElementById(driver, Location_path.getProperty("SignIn_Id"));
		HelperClass.ElementSelectorSendKeys(driver, Location_path.getProperty("Signup_Username"), Data_path.getProperty("UsernameSignup"));
		HelperClass.ElementSendKeys(driver, Location_path.getProperty("Signup_Password"), Data_path.getProperty("PasswordSignup"));
	    HelperClass.elementClick(driver, Location_path.getProperty("ButtonXpath"));
	    WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

	}

}
