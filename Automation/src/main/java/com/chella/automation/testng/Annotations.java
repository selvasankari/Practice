package com.chella.automation.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import 	org.testng.Assert;

public class Annotations {
	
	public String url = "http://newtours.demoaut.com/";
	public WebDriver driver = new FirefoxDriver();
	public String expected_title = null;
	public String actual_title= null;
	
	@BeforeTest
		public void launch_browser()
	{
		driver.get(url);
	}
	
	@AfterTest
	public void close_browser()
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void verifyHomePageTitle()
	{
		
		expected_title = "Welcome: Mercury Tours";
		actual_title= driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		
	}
	
	@AfterMethod
	public void clickHomePage()
	{
		driver.findElement(By.linkText("Home")).click();
	}
	
  @Test(priority=0)
  public void verifyRegisterTitle() {
	  
	  driver.findElement(By.linkText("REGISTER")).click();
	  expected_title = "Register: Mercury Tours";
	  actual_title =driver.getTitle(); 
	  Assert.assertEquals(actual_title, expected_title);
	  }
  
  @Test(priority= 1)
  public void verifySupportTitle()
  {
	  driver.findElement(By.linkText("SUPPORT")).click();
	  expected_title= "Under Construction: Mercury Tours";
	  actual_title =driver.getTitle();
	  Assert.assertEquals(actual_title, expected_title);
  }
}
