package com.chella.automation.testng;


import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbayHomePage {
	
	public String url = "http://www.ebay.com/";
	public WebDriver driver;
  @BeforeTest
  public void login() {
	  driver = new FirefoxDriver();
	  driver.get (url);	  
  }
  
  @Test
public void verifyElementsinHomePage()
  {
	  WebDriverWait wait = new WebDriverWait(driver, 20);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Daily Deals")));
	  String  text =driver.findElement(By.cssSelector("a.gh-p")).getText();
	  Assert.assertEquals(text, "Daily Deals");
	  
	  
	  
  }
  
  @Test
public void dailyDeals(){
	 // WebElement dailyLinkTest = driver.findElement(By.cssSelector("a.gh-p"));
	 // dailyLinkTest.click();
	  
  }
  @Test
public void motors()
  {
	  WebElement motors = driver.findElement(By.linkText("Motors"));
	  Actions builder = new Actions(driver);
	  Action keyevent = builder
			  .moveToElement(motors)
		
			  .build();
	  keyevent.perform();
	


	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//a[contains(text(), 'Vehicles')]")).getText());
		driver.findElement(By.xpath("//a[contains(text(), 'Vehicles')]")).click();

  }
  /**
  @Test
  public void selectCategory()
  {
	 WebElement selectCategoryEle = driver.findElement(By.id("gh-cat"));
	  Select selectCategory = new Select(selectCategoryEle);

	  Assert.assertFalse(selectCategory.isMultiple()); 
	  selectCategory.selectByIndex(1);
  }
  */
  @Test
public void MotorsPage()
  {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 // driver.findElement(By.xpath("//li[@class='focus-li']/span[@class='arrow-square']")).click();
		//List<WebElement> arrowhead =driver.findElements(By.xpath("//li[@class='focus-li']/span[@class='arrow-square']"));
	  List <WebElement> list = driver.findElements(By.xpath("//a[@class='title extended-links']"));
			 
	  int size = list.size();
		System.out.println(size);
		//Assert.assertEquals(size, 7);

	  driver.findElement(By.partialLinkText("Cars")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement classics=
	  driver.findElement(By.xpath(("//ul[@class='navigation-list nested add-it']/*/a[@href= 'http://www.ebay.com/rpp/classics-exotics']")));
	  classics.click();
	  
  }
  public void arrowheadTest()
  {

  }
  

@Test
public void exit()

{
//	driver.close();
}
}
