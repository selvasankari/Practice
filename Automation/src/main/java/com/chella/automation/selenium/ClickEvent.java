package com.chella.automation.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickEvent {

	public static void main(String[] args){
		
		String baseUrl="https://www.facebook.com/";
		
		WebDriver driver= new FirefoxDriver();
		driver.get(baseUrl);
		
		String username= "";
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("persist_box")).click();
		driver.findElement(By.id("persist_box")).click();
		
		
		
		if(driver.findElement(By.id("persist_box")).isSelected())
		{
			System.out.println("Keep me Logged is checked");
		}
		else
		{
			System.out.println("Keep me Logged is not checked");
				
		}
		
driver.findElement(By.id("persist_box")).click();
		
		
		
		if(driver.findElement(By.id("persist_box")).isSelected())
		{
			System.out.println("Keep me Logged is checked");
		}
		else
		{
			System.out.println("Keep me Logged is not checked");
				
		}
		
		driver.quit();
		System.exit(0);
		
		
		
		
		
		
		
		
				
		
	}
}
