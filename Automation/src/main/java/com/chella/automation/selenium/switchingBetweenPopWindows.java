package com.chella.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 

public class switchingBetweenPopWindows {
	
	public static void main(String[] args)
	{
		
		/**To access the elements within the alert (such as the message it contains),
		 *  we must use the "switchTo().alert()" method. In the code below, 
		 *  we will use this method to access the alert box and 
		 *  then retrieve its message using the "getText()" method, and then automatically
		 *  close the alert box using the "switchTo().alert().accept()" method. */
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jsbin.com/usidix/1");
		 
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		
		
		String alertMessage="";
		alertMessage=driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		
	    driver.switchTo().alert().accept();
	    
	    driver.quit();
	    
	}
	
	
	

}
