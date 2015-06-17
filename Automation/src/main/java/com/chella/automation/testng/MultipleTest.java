package com.chella.automation.testng;

import org.testng.annotations.Test;

//if there is no priority mentioned, then it will execute based on the method name ascending order
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.SkipException;

public class MultipleTest {
  @Test
  public void c_test() {
	  Assert.assertTrue(true);
  }
  
  @Test
  public void a_test()
  {
	  Assert.assertTrue(true);
  }
  
 @Test
 public void b_test()
 {
	 //throw new SkipException("Skip b_test");
	  Assert.assertTrue(true);
	 
 }
}
