package com.chella.automation.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class tagName {
	
	public static void main (String args[])
	{
		WebDriver driver = new FirefoxDriver();
		String baseUrl="http://www.facebook.com";
		String tagName="";
		
		driver.get(baseUrl);
		//Locating elements in WebDriver is done by using the "findElement(By.locator())" method. 
		
		//using firebug we can find the id
		tagName =driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		driver.close();
		System.exit(0);
		
		
		
		
		
		
	}

}
