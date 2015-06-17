package com.chella.automation.selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ContextClickAction;
import org.openqa.selenium.interactions.KeyDownAction;
public class KeyAction {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		String url ="https://www.facebook.com";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username_textbox = driver.findElement(By.id("u_0_1"));

		
		Actions builder = new Actions(driver);
		
		Action keyevent = builder
				.moveToElement(username_textbox)
				.click()
				//To type hello in capital letters - start
				.keyDown(username_textbox, Keys.SHIFT)
				.sendKeys(username_textbox, "hello")
				.keyUp(username_textbox, Keys.SHIFT)
				//To type hello in capital letters - End
				
				//To highlight the text
				.doubleClick(username_textbox)
				
				//To bring the context menu
				.contextClick()
				.build();
		keyevent.perform();
		
	//driver.quit();
	System.exit(0);

				
				
		
				
		
		
		
		
		
		
	}

}
