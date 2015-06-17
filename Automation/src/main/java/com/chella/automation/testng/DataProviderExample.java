package com.chella.automation.testng;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	public WebDriver driver;
  @BeforeTest
  public void setup() {
	 driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
  }
  
  
  @DataProvider(name ="searchProvider")
  public Object[] [] testData()
  {
	  return new Object[][] {
			  { "Guru99", "selvasankari gmail" },
			  
             // { "Krishna", "UK" },

              //{ "Bhupesh", "USA" }
	  };
	  }
	  
  
  @Test(dataProvider="searchProvider")
  public void search(String author, String searchkey) throws InterruptedException
  {
	  WebElement ele;
	  Thread.sleep(1000);
	  ele = driver.findElement(By.name("q"));
	  ele.sendKeys(searchkey);
	  Thread.sleep(3000);
	  System.out.println(searchkey);
	  
	  String value= ele.getText();
	  System.out.println("getText value" +value);
	  System.out.println(value.length());
	  value=ele.getAttribute("value");
	  System.out.println(value);
	  ele.clear();
	  Assert.assertTrue(value.equalsIgnoreCase(searchkey));
	  
	  
  }
  }

