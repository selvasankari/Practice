package com.chella.automation.testng;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethod {
	
	public WebDriver driver;
	
  @Test
  
  
  public void setup() {
	  driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
	  
  }
  
  @Test(dataProvider="DP")
  public void testMethodA(String name,String searchkey) throws InterruptedException
  {
	  WebElement ele = driver.findElement(By.name("q"));
	  ele.sendKeys(searchkey);
	  Thread.sleep(2000);
	  String text = ele.getAttribute("value");
	  System.out.println(ele.getAttribute("value"));
	  ele.clear();
	  Assert.assertEquals(text, searchkey);
  }
  @Test(dataProvider="DP")
  public void testMethodB(String searchkey) throws InterruptedException
  {
	  WebElement ele = driver.findElement(By.name("q"));
	  ele.sendKeys(searchkey);
	  Thread.sleep(2000);
	  String text = ele.getAttribute("value");
	  System.out.println(ele.getAttribute("value"));
	  ele.clear();
	  Assert.assertEquals(text, searchkey);
  }
  
  
  @DataProvider(name= "DP")
  public Object[][] getDataProvider(Method m)
  {
	  
	  if(m.getName().equalsIgnoreCase("testMethodA"))
			  {
		  return new Object[][]{
				  {"hi","Shiny"},
				  {"hello","Jashu"}
		  };
			  }
		  else
			  
		  {
			  return new Object[][]{
					  {"hi"},{"hello"}
			  };
			  }
  }
  
  }

