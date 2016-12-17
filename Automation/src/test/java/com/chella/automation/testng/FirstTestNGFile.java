package com.chella.automation.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGFile {
  public String url = "http://facebook.com/";
  public WebDriver driver;
  
  @Test
  public void verifyHomePageTitle() {
	  driver = new FirefoxDriver();
	  driver.get(url);
	  String expectedTitle ="Facebook - Log In or Sign Up";
	  String actualTitle = driver.getTitle();
	  System.out.println(actualTitle);
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
	  
	  
	  driver.quit();
	  
	
}
  
}
