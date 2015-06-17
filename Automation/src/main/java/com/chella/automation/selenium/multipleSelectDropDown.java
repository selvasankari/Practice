package com.chella.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleSelectDropDown {
	
	public static void main(String[] args){
		
		WebDriver driver = new FirefoxDriver();
		String url= "http://jsbin.com/osebed/2";
		driver.get(url);
		
		Select multiple_select = new Select(driver.findElement(By.id("fruits")));
		multiple_select.selectByIndex(0);
	    multiple_select.selectByValue("apple");
	    multiple_select.selectByVisibleText("Orange");
	    
	    if(multiple_select .isMultiple())
	    {
	    	System.out.println("we can select multiple values");
	    }
	    else
	    {
	    	System.out.println("we cannot select multiple values");
	    }
		
	  //  List<WebElement> ls=multiple_select.getAllSelectedOptions();
	   /* int i=0;
	    
	    ls=();
	    
	    
	    do
	    {
	    	System.out.println(ls);
	    	i++;
	    }while (i==1);*/
	    List<WebElement> resultList = multiple_select.getAllSelectedOptions();
        for (WebElement resultItem : resultList){
           String tabname=resultItem.getText();
           System.out.println(tabname);
	   /* String selected_value="";
	    selected_value= multiple_select.getFirstSelectedOption().getText();*/
        }
	    
	    //System.out.println(selected_value);
	    
	    	    
	    
	    
	    
	    
	    
	    
   		
	}

}
