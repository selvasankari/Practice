package com.chella.practice.java;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {

	public static void main(String args[]) {
		MissingNumber mn = new MissingNumber();
		int arr[] = { 2, 8, 4, 5, 6, 7 };
		// mn.findMissingNumber(arr);
		//mn.reversearray(arr);
		mn.findTwoSmallest(arr);
		mn.squareNumber(arr);
		

	}

	public void findMissingNumber(int arr[]) {
		int n = arr.length;
		int sum = n * (n + 1) / 2;
		for (int i = 0; i < n - 1; i++) {
			sum = sum - arr[i];
		}
		System.out.println(sum);
	}

	public void reversearray(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);

		}
	}

	public void findTwoSmallest(int arr[]) {
		if (arr.length < 2)
			System.out.println("less than 2 elements in the array");
		if (arr.length == 2)
			System.out.println(arr[0] + "" + arr[1]);
		int first = arr[0];
		int second = arr[1];
		for (int i = 2; i < arr.length - 1; i++) {
			if (arr[i] < first) {
				second = first;
				first = arr[i];
			}
			if (arr[i] < second && arr[i] != first) {
				second = arr[i];
			}

		}
		System.out.println(first + " " + second);
		
		
		
	}
	
	public void squareNumber (int[] nums)
	{
		int len = nums.length;
		
		for(int i=0; i<len; i++)
		{
			int squ = nums[i] * nums[i];
			nums[i]=squ;
			System.out.println(nums[i]);
		}

		
		
		/**
		 * function squareSortedArr(arr) { 
	return arr.map(x => x*x);
}*/
		 
	}

}
