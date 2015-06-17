package com.chella.automation.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGFile {
  public String url = "http://facebook.com/";
  public WebDriver driver = new FirefoxDriver();
  
  @Test
  public void verifyHomePageTitle() {
	  
	  driver.get(url);
	  String expectedTitle ="Welcome to Facebook - Log In, Sign Up or Learn More";
	  String actualTitle = driver.getTitle();
	  System.out.println(actualTitle);
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
	  
	  
	  driver.quit();
	  
	
}
  
}
