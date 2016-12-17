package com.chella.automation.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MotorsPagePOM {
 
	WebDriver driver;
	
	By carsLink = By.partialLinkText("Cars");
	By classics = By.partialLinkText("Classics");
	
	public MotorsPagePOM(WebDriver driver)
	{
		this.driver= driver;
	}
	
	//Click on Cars
	public void carLinkClick()
	{
		driver.findElement(carsLink).click();
	}
	
	
}
