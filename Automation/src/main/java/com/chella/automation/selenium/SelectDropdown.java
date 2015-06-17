package com.chella.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	
	public static void main(String[] args)
	{
		String url="http://newtours.demoaut.com/mercuryregister.php";
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		//declaring the select object
		Select  select_dropDown = new Select(driver.findElement(By.name("country")));
		//choosing the option in the drop down
		select_dropDown.selectByVisibleText("INDIA");
		//getting the selected option
		String selected_country = select_dropDown.getFirstSelectedOption().getText();
		
	
		//printing the selected country
		System.out.println(selected_country);
		
		/**
		for (int i=0; i<=1; i++)
		{
			
		
		
		if (select_dropDown.getFirstSelectedOption().isEnabled())
		{
			System.out.println("Selected Option is India");
		}
		else
		{
			System.out.println("Selected Option is Unite");
		}
		select_dropDown.deselectByVisibleText("INDIA");
			
		}
		*/
			
		driver.quit();
		System.exit(0);
	
		
		
	}

}
