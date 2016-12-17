package com.chella.practice.java.algo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuickSortTest {
	QuickSort q = new QuickSort();

	@Test
	public void positiveQuickSortTest() {

		int arr[] = { 9, 2, 4, 7, 3, 7, 10 };
		int result[] = q.quickSort(arr, 0, arr.length - 1);
		int expected[] = { 2, 3, 4, 7, 7, 9, 10 };

		Assert.assertEquals(result, expected);

	}

	@Test
	public void nullValue() {

		int arr[] = {};
		int result[] = q.quickSort(arr, 0, arr.length - 1);
		int expected[] = {};

		Assert.assertEquals(result, expected);

	}
	@Test
	public void negativeValues()
	{
		int arr[] = { 9, 2, 4, 7, 3, 7, 10, -1};
		int result[] = q.quickSort(arr, 0, arr.length - 1);
		int expected[] = { -1,2, 3, 4, 7, 7, 9, 10 };

		Assert.assertEquals(result, expected);
	}
}
