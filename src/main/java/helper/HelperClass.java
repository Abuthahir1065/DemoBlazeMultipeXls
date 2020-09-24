package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperClass {
	
	WebDriver driver;

	public HelperClass(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void elementClick(WebDriver driver,String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		
		
	}
	public static void elementSelector(WebDriver driver,String csspath)
	{
		driver.findElement(By.cssSelector(csspath)).click();
	}
	public static void ElementSelectorSendKeys(WebDriver driver,String csspath,String key)
	{
		driver.findElement(By.cssSelector(csspath)).sendKeys(key);
	}
	public static void ElementSendKeys(WebDriver driver,String xpath,String key)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(key);
	}
	public static void selectElementById(WebDriver driver,String idPath)
	{
		driver.findElement(By.id(idPath)).click();
	}
	public static void sendKeyById(WebDriver driver,String idPath,String key)
	{
		driver.findElement(By.id(idPath)).sendKeys(key);
	}
	public static void selectElementByClassName(WebDriver driver,String name)
	{
		driver.findElement(By.className(name)).click();
	}

}
