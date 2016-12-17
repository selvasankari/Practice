package com.chella.automation.testng;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.apache.log4j.*;

public class HomePage {

	WebDriver driver;
	Logger log;
	
	By username= By.xpath("//table//tr[@class='heading3']");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getUserName()
	{
		String str= driver.findElement(username).getText();
		log.getLogger(HomePage.class);
		log.info("getUserName method --- getting the username"+str);
		
		return str;
	}
	
}
