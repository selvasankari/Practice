package com.chella.automation.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchingBetweenFrames {
	
	public static void main(String[] args){
		
		WebDriver driver= new FirefoxDriver();
		
		//To access GUI elements in a Frame, we should first direct WebDriver to focus on the
		//frame or pop-up window 
		//first before we can access elements within them.
		driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");
		
		//Switching to the frame
		driver.switchTo().frame("classFrame");
		//clicking the link "deprecated"
		driver.findElement(By.linkText("Tree")).click();
		//driver.quit();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		
	}
	
	}


