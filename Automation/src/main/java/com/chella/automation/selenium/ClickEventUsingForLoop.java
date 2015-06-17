package com.chella.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickEventUsingForLoop {
	
	public static void main(String[] args){
		
		WebDriver driver= new FirefoxDriver();
		
		
		String url="https://www.facebook.com/";
		driver.get(url);
		WebElement user_name= driver.findElement(By.id("persist_box"));
		
		for(int i=0; i<=1; i++)

		{
			user_name.click();
			if(user_name.isSelected())
			{
				System.out.println("Keep me Logged is checked");
			}
			
			else
			{
				System.out.println("keep me logged is not checked");
			}
			
		 }
		
	     driver.quit();
	     
		}
	}


