package com.chella.automation.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailLogin {
	public WebDriver driver;


	@Test
	public void setup() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.cssSelector("input#Email")).sendKeys("chella.venkat1927@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#Passwd")).sendKeys("maniarasi");
		driver.findElement(By.id("signIn")).click();
		//driver.findElement(By.cssSelector("div.gb_Ib gb_Nd gb_R")).click();
		
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		
		
		
		driver.findElement(By.id("gb_71")).click();
	}
 
  }

