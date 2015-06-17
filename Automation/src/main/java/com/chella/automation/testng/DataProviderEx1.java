package com.chella.automation.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {
  

	/**@DataProvider(name="DP1")
	
	public Object[] createObject()
	{
		Object[][] objectarray = {{"1", "Chella", "Chennai"},
								  {"2", "siva", "chennai"},
							      {"3", "bommi", "chennai"}};
		
		
		return objectarray;
		
	}
	*/
	public WebDriver driver;
	@Test
	public void setup()
	{
		driver= new FirefoxDriver();
		driver.get("http://www.google.com");
	}
@Test(dataProvider="dp", dataProviderClass=DataProviderAnotherClass.class)
  public void testdata(String empid, String name) throws InterruptedException {
	 WebElement ele;
	  Thread.sleep(1000);
	  ele = driver.findElement(By.name("q"));
	  ele.sendKeys(name);
	  Thread.sleep(3000);
	  System.out.println(name);
	  
	  String value= ele.getText();
	  System.out.println("getText value" +value);
	  System.out.println(value.length());
	  value=ele.getAttribute("value");
	  System.out.println(value);
	  ele.clear();
	  Assert.assertTrue(value.equalsIgnoreCase(name));

	
	
	
  }
}
