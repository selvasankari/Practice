package com.chella.automation.testng;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearch {
	
  public WebDriver driver;
  public String result;
	public String url ="https://www.google.com";
@BeforeTest
public void launchGoogle()
{
 driver= new FirefoxDriver();
 driver.get(url);
}
  @AfterTest
  public void exit() {
	 // driver.quit();
  }
  
  
  /*
  @Test(priority=1)
  public void googleSearch()

  {
	  WebElement table;
	  //element = driver.findElement(By.xpath("html/body/div/div[2]/div/div/div[3]/div/div/div/form/fieldset[2]/div/div/div/table/tbody/tr/td[2]/div/input[3]"));
	  driver.findElement(By.name("q")).sendKeys("");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  table=driver.findElement(By.className("gssb_m"));
	  List <WebElement> rows = table.findElements(By.tagName("tr"));
	  Iterator<WebElement> i = rows.iterator();
	  
	  while(i.hasNext())
	  {
		  WebElement rowElement = i.next();
		  System.out.println("i starts-------\n");
		  List <WebElement> columns =table.findElements(By.tagName("td"));
		  Iterator<WebElement> j= columns.iterator();
		  
		  while(j.hasNext())
		  {
			  WebElement column = j.next();
			 // System.out.println(column.getText());
		  }
		  
	  }
	    
  }
  
  */
  @Test(priority=2)
  public void google()
  {
	  
	  driver.findElement(By.name("q")).sendKeys("hello sign gmail");
	  driver.findElement(By.name("btnG")).click();
	 /**
	  result=driver.findElement(By.id("resultStats")).getText();
	  System.out.println("text is " +result);
	  
	  String[] expected;
	  expected = result.split(" ");
	  
	  for(String s:expected)
	  {
		  System.out.println(s);
	  }
	  
	  System.out.println("The number of results is " +expected[1]);
	  
	  String s = expected[1];
	  s=s.replace(",","" );
	
	  int n =Integer.parseInt(s);
	  
	  System.out.println(n);
	  */
  }

  
  @Test(priority =3)
  public void pagecheck()
  
  {
	  int i=2;;
	//  for(i=1;i <=10; i++){
	  driver.findElement(By.linkText("Next")).click();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  String[] expected ;
	  String text = driver.findElement(By.id("resultStats")).getText();
	  System.out.println("hello" +text);
	  expected = text.split(" ");
	  
	 // for(String s:expected)
	  //{
		//  System.out.println(s);
	  //}
	  
	  System.out.println("The number of results is " +expected[1]);
	  
	  String s = expected[1];
	  s=s.replace(",","" );
	  int n =Integer.parseInt(s);
	  
	  System.out.println(n);
	  Assert.assertEquals(i, n);
	  //}
  }
  
  
  
}
