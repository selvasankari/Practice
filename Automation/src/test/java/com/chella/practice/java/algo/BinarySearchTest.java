package com.chella.practice.java.algo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;




public class BinarySearchTest {
  @Test
  public void positveSearch()
  {
	   int array[] = {1,2,3,4,5,6};
		BinarySearch bn = new BinarySearch();
		int result = bn.binarySearch(array, 4);
		AssertJUnit.assertEquals(result, 4);
		
		result = bn.binarySearch(array, 9);
		AssertJUnit.assertEquals(result, 0);

  }
}
