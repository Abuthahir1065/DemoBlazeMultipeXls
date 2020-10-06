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
import reader.LoginDataProvider;
import reader.PropertyReader;
import reader.SignInDataProvider;

public class LoginClass extends SetUp {

	Properties Location_path;

	@Test(dataProvider = "Login", dataProviderClass = LoginDataProvider.class)
	public void login(String username, String password) throws InterruptedException, IOException {
		Location_path=PropertyReader.readProperty(Constant.LOCATOR_PATH);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	HelperClass.selectElementById(driver, Location_path.getProperty("LoginId"));
		HelperClass.ElementSelectorSendKeys(driver, Location_path.getProperty("Login_User"),username);
		HelperClass.ElementSendKeys(driver, Location_path.getProperty("Login_Password"),password);
		HelperClass.elementClick(driver, Location_path.getProperty("LoginButton"));

	}

}
