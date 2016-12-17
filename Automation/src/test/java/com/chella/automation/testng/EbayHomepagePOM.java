package com.chella.automation.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EbayHomepagePOM {

	WebDriver driver;

	By motorsLink = By.linkText("Motors");
	By selectCategory = By.id("gh-cat");
	By Vehicles = By.xpath("//a[contains(text(), 'Vehicles')]");

	public EbayHomepagePOM(WebDriver driver) {
		this.driver = driver;
	}

	// Click on Motors Link
	public void moveToMotorsLink() {
		Actions builder = new Actions(driver);
		Action keyevent = builder
				.moveToElement(driver.findElement(motorsLink))
				.build();
		keyevent.perform();

	}
	
	public void clickOnVehicles()
	{
		driver.findElement(Vehicles).click();
	}
	
	public boolean motorsIsDisplayed()
	{
		return driver.findElement(motorsLink).isDisplayed();
	}
	
	
	

}
