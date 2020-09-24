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

public class AddCartClass extends SetUp {
	Properties Location_path,Data_path;

		public void addCart() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Location_path=PropertyReader.readProperty(Constant.LOCATOR_FILE_PATH);
		Data_path=PropertyReader.readProperty(Constant.DATA_FILE_PATH);
		HelperClass.selectElementByClassName(driver, Location_path.getProperty("Home"));
		HelperClass.elementClick(driver, Location_path.getProperty("MobileLink"));
		HelperClass.elementClick(driver, Location_path.getProperty("AddToCart"));

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		HelperClass.elementClick(driver, Location_path.getProperty("CartLink"));

		Thread.sleep(5000);
		HelperClass.elementClick(driver, Location_path.getProperty("PlaceOrder"));
		HelperClass.sendKeyById(driver, Location_path.getProperty("Name_id"), Data_path.getProperty("Name"));
		HelperClass.sendKeyById(driver, Location_path.getProperty("Country_id"), Data_path.getProperty("Country"));
		HelperClass.sendKeyById(driver, Location_path.getProperty("City_id"), Data_path.getProperty("City"));
		HelperClass.sendKeyById(driver, Location_path.getProperty("Card_id"), Data_path.getProperty("Card"));
		HelperClass.sendKeyById(driver, Location_path.getProperty("Month_id"), Data_path.getProperty("Month"));
		HelperClass.sendKeyById(driver, Location_path.getProperty("Year_id"), Data_path.getProperty("Year"));

		HelperClass.elementClick(driver, Location_path.getProperty("ClickPlaceOrder"));
		HelperClass.elementClick(driver, Location_path.getProperty("OKButton"));
		
		
	}

}
