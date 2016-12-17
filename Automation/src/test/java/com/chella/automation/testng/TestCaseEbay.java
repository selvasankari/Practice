package com.chella.automation.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseEbay {
	WebDriver driver;
	EbayHomepagePOM ebayHomeobj;
	MotorsPagePOM motorsobj;
	
	@BeforeTest
	public void setup()
	{
		driver= new FirefoxDriver();

		driver.get("http://www.ebay.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority =0)
	public void checkHomepage()
	{
		ebayHomeobj= new EbayHomepagePOM(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ebayHomeobj.moveToMotorsLink();
		Assert.assertTrue(ebayHomeobj.motorsIsDisplayed());
		
	}

	
}
