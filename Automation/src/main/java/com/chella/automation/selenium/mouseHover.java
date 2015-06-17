package com.chella.automation.selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class mouseHover {
	public static void main ( String[] args){
		
		WebDriver driver = new FirefoxDriver();
		String url = "http://newtours.demoaut.com/";
		driver.get(url);
		
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		WebElement home = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
		
														
		
		Actions builder = new Actions(driver);
		
		Action Bg_color = builder
				.moveToElement(link_Home)
				.build();
		
		
		String home_bgcolor = home.getCssValue("background-color");
		System.out.println(home_bgcolor);
		
		Bg_color.perform();
		home_bgcolor= home.getCssValue("background-color");
		System.out.println("\n" + home_bgcolor);
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
