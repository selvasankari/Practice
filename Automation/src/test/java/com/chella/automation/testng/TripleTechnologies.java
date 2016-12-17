package com.chella.automation.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TripleTechnologies {
	WebDriver driver;
	String homePageTitle = "Triple Ring Technologies, Home Page";
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://tripleringtech.com/");
			
	}
 
	@Test (priority =1)
	public void  verifyHomepageTitle()
	{
	 
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, homePageTitle);
		
	}
	
	@Test (priority =2)
	public void home()
	{
		Actions builder = new Actions(driver);
		Action action = builder
				.moveToElement(driver.findElement(By.linkText("About Us")))
				.build();
				action.perform();
				List<WebElement> linkElements = driver.findElements(By.tagName("<li>"));
				String []   linkTexts  = new String [linkElements.size()];
				System.out.println(linkTexts.toString());
				int i = 0;
				
				Assert.assertTrue(driver.findElement(By.linkText("Company Overview")).isDisplayed());
				Assert.assertTrue(driver.findElement(By.linkText("Our Team")).isDisplayed());
				Assert.assertTrue(driver.findElement(By.linkText("Partners")).isDisplayed());
				Assert.assertTrue(driver.findElement(By.linkText("Academic Collaborators")).isDisplayed());
				Assert.assertTrue(driver.findElement(By.linkText("Careers")).isDisplayed());
				
				driver.findElement(By.linkText("Company Overview")).click();
				
				
		        //extract the link texts of each link element
		        for (WebElement e : linkElements) {
		           System.out.println(e.getText());
		            i++;
		        }
				
	}
	
	
}
