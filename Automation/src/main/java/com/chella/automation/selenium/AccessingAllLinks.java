package com.chella.automation.selenium;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;


import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 

public class AccessingAllLinks {

public static void main(String[] args){
	
	WebDriver driver= new FirefoxDriver();
	String url ="http://newtours.demoaut.com/";
	driver.get(url);
	
	String ConstTitle = "Under Construction: Mercury Tours";
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	List<WebElement> list1 = driver.findElements(By.tagName("a"));
	int listSize = list1.size();
	
	String[] linkTexts= new String[listSize];
	int i=0;
	
	for(WebElement e : list1)
	{
		linkTexts[i]= e.getText();
		System.out.println(linkTexts[i] +"\n");
		i++;
		
	}
	
	for(String x : linkTexts)
	{
		driver.findElement(By.linkText(x)).click();
		if(driver.getTitle().contentEquals(ConstTitle))
		{
			System.out.println("\t" + x + "is under construction\n");
		}
		else
		{
			System.out.println("\t" + x + "is working\n");
		}
		driver.navigate().back();
	}
	
	//driver.quit();
	
}
}
