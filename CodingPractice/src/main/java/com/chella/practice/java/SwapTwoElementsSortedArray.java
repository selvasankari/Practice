package com.chella.practice.java;

public class SwapTwoElementsSortedArray {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 60, 40, 50, 30 };
		int n = arr.length;
		sortByOneSwap(arr, n);

	}
/*
 * Input:  arr[] = {10, 20, 60, 40, 50, 30}  
// 30 and 60 are swapped
Output: arr[] = {10, 20, 30, 40, 50, 60}
 */
	public static void sortByOneSwap(int arr[], int n) {
		// Travers the given array from rightmost side
		for (int i = n - 1; i > 0; i--) {
			// Check if arr[i] is not in order
			if (arr[i] < arr[i - 1]) {
				// Find the other element to be
				// swapped with arr[i]
				int j = i - 1;
				while (j >= 0 && arr[i] < arr[j])
					j--;
				int temp = arr[i];
				arr[i] = arr[j + 1];
				arr[j + 1] = temp;

				break;
			}
		}
		for(int k=0; k<n;k++)
		{
			System.out.println(arr[k]);
		}
	}

}
