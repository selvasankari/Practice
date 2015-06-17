package com.chella.automation.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkClick {
	public static void main (String[] args[]){
		WebDriver driver = new FirefoxDriver();
		String url= "http://newtours.demoaut.com";
		
		driver.get(url);
		
		String reg= driver.findElement(By.partialLinkText("egis")).getText();
		String Register = driver.findElement(By.partialLinkText("EGIS")).getText();
		System.out.println(reg + "\n" + Register);
		driver.quit();
		System.exit(0);
		
		
		
		
	}

}
