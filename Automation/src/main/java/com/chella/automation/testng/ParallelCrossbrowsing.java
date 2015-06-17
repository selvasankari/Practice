package com.chella.automation.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelCrossbrowsing {
	
	public WebDriver driver;
	public String url ="www.google.com";
	
  @BeforeTest
  @Parameters("browser")
  
  public void setup(String browser) throws Exception {
	  if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.out.println(browser);
		 // System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		  driver = new FirefoxDriver();
		//  driver.get(url);
	  }
	  else if(browser.equalsIgnoreCase("Chrome"))	
	  {
		  System.out.println(browser);
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Selvasankari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  System.out.println("******"+browser);
		  driver = new ChromeDriver();
		  System.out.println("******"+browser);
		 // driver.manage().window().maximize();
		 // driver.get(url);
		  System.out.println(browser);
	  }
	  else if(browser.equalsIgnoreCase("IE")){
		  System.out.println(browser);
              System.setProperty("webdriver.ie.driver","C:\\Users\\Selvasankari\\Downloads\\IEDriverServer_Win32_2.42.0\\IEDriverServer.exe");
              System.out.println(browser);  System.out.println("$$$$$$$"+browser);
                driver = new InternetExplorerDriver();
                System.out.println(browser);  System.out.println("^^^^^^"+browser);
               // driver.get(url);
      }

      else{

          //If no browser passed throw exception

          throw new Exception("Browser is not correct");

      }
	  
	  	
	  
	  }
  
  @Test
  public void search()
  {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://www.google.com"); 
	  WebElement ele= driver.findElement(By.name("q"));
	  System.out.println();
	 ele.sendKeys("hello");
	 System.out.println(driver.getTitle());
	  
  }
  /**
  public void testParameterWithXML() throws InterruptedException{
	  
      driver.get("http://demo.guru99.com/V4/");

      //Find user name

      WebElement userName = driver.findElement(By.name("uid"));

      //Fill user name

      userName.sendKeys("guru99");

      //Find password

      WebElement password = driver.findElement(By.name("password"));

      //Fill password

      password.sendKeys("guru99");

  }
  
  **/
  
  }

 

