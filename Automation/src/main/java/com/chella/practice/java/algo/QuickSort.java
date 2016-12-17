package com.chella.practice.java.algo;

public class QuickSort {

	public static void main(String args[]) {
		
		int[] arr={9,2,4,7,3,7,10};
		
		int low = 0;
		int high= (arr.length)-1;
		QuickSort q = new QuickSort();
		q.quickSort(arr, low, high);
		

	}

	public int[] quickSort(int arr[], int low, int high) {

		if (arr == null || arr.length == 0) {
			return arr;
		}

		if (low >= high)
			return arr;

		int i = low;
		int j = high;
		int middle = (high + low) / 2;
		int pivot = arr[middle];
		System.out.println();
printArray(arr);
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}

			if (low < j) {
				quickSort(arr, low, j);
			}
			if (high > i) {
				quickSort(arr, i, high);
			}

		}

		return arr;
	}
	
	public void printArray(int[] arr)
	{
		for(int i: arr)
		{
			System.out.print(i);
		}
	}

}
