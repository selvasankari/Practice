package com.chella.automation.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadingFile {
	
	public static void main(String[] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		String url = "http://www.megafileupload.com/";
		driver.get (url);
		
		WebElement input = driver.findElement(By.id("uploadfile_0"));
		input.sendKeys("file:///C:/Users/Selvasankari/Desktop/newHtml.html");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();
		
		
		driver.quit();
		
		
	}

}
