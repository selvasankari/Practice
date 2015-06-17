package com.chella.automation.testng;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	By username= By.xpath("//table//tr[@class='heading3']");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getUserName()
	{
		String str= driver.findElement(username).getText();
		return str;
	}
	
}
