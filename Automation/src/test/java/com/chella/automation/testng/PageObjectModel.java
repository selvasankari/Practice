package com.chella.automation.testng;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PageObjectModel {

	
	WebDriver driver;
	Guru99Login login;
	HomePage home;
	String str,name;
    
	@BeforeTest
	
	public void setup()
	{
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		
		WebDriverWait wait;
		wait =new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("uid")));
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(priority=0)
	public void login()
	{
		login= new Guru99Login(driver);
		str= login.getLoginTitle();
		Assert.assertEquals(str, "guru99 bank");
		login.login("mgr123", "mgr123");
		
		
		
		
		
				
	}
	
	@Test(priority=1)
	public void homePage()
	{
		home =new HomePage(driver);
		name =home.getUserName();
		Assert.assertEquals(name, "manger id : mgr123");
		
	}
	
  
  }

