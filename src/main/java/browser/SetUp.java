
package browser;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


import constant.Constant;


public class SetUp {

	public static WebDriver driver;
	public static Properties properties;
	

	@BeforeMethod
	public void declaration()  {
		System.setProperty("webdriver.chrome.driver", Constant.CHROME_PATH);
		driver = new ChromeDriver();

		driver.get("https://www.demoblaze.com");
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
