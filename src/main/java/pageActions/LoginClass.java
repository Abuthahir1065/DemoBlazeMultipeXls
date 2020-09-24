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

public class LoginClass extends SetUp {

	Properties Location_path, Data_path;


	public void login() throws InterruptedException, IOException {
		Location_path=PropertyReader.readProperty(Constant.LOCATOR_FILE_PATH);
		Data_path=PropertyReader.readProperty(Constant.DATA_FILE_PATH);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(driver, 40);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Location_path.getProperty("LoginId"))));

	HelperClass.selectElementById(driver, Location_path.getProperty("LoginId"));
		HelperClass.ElementSelectorSendKeys(driver, Location_path.getProperty("Login_User"),
				Data_path.getProperty("UsernameLogin"));
		HelperClass.ElementSendKeys(driver, Location_path.getProperty("Login_Password"),
				Data_path.getProperty("PasswordLogin"));
		HelperClass.elementClick(driver, Location_path.getProperty("LoginButton"));

	}

}
