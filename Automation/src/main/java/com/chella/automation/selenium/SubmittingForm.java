package com.chella.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SubmittingForm {
	
	public static void main(String[] args){
		
		String url = "http://newtours.demoaut.com";
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("password")).submit();
		System.out.println("Hi");
		
		//driver.quit();
		
		
		
	}

}
