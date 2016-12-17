package com.chella.automation.testng;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class Google {
	WebDriver driver;
	String url ="https://www.google.com";
	
	@BeforeTest
	public void set()
	{
		driver = new FirefoxDriver();
		driver.get(url);
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
	}
	
	@AfterTest
	public void exit()
	{
	//	driver.quit();
	}
	@Test(priority=1)
	public void google_search()
	{
		driver.findElement(By.name("q")).sendKeys("hello");
		driver.findElement(By.name("btnG")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	
	@Test(priority=2)
	public void countResults()
	{
		String result;
		WebElement ele= driver.findElement(By.cssSelector("div#extabar"));
		result=ele.getText();
		System.out.println(result);
		result= ele.getTagName();
		System.out.println(result);
		
	}
	

  
}
