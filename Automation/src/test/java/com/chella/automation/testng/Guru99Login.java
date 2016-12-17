package com.chella.automation.testng;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class Guru99Login {
	
	WebDriver driver;
	By userName = By.name("uid");
	By password = By.name("password");
	By titleText =By.className("barone");
	By login = By.name("btnLogin");
	
	public Guru99Login (WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Setting the username
	
	public void setUserName(String username)
	{
		driver.findElement(userName).sendKeys(username);
	}	
	
	
	//Setting the password
	
	public void setPwd(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}	
	
	//Click on Login button
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
    
	 //get the title
	public String getLoginTitle()
	{
		String str=driver.findElement(titleText).getText();
		return str;
	}
	
	
	/* this POM method will be exposed in the test case to login into the application
	   
	   * @param strUserName
 
       * @param strPasword
  
       * @return
       
	 * */
	
	public void login(String username, String pwd)
	{
		this.setUserName(username);
		this.setPwd(pwd);
		this.clickLogin();
	}
	
}
