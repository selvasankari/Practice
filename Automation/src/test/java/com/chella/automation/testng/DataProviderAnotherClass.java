package com.chella.automation.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnotherClass {
	
  @DataProvider(name ="dp")
  public static Object [][] DP() {
	  
	  return new Object[][]{
			  {"hi", "hi"},
			  {"chella", "chella"}
  };
  }
}
