package com.chella.practice.java;

public class QuickSort {

	private int array[];
	private int length;

	public void sort(int[] inputarr) {
		if (inputarr == null || inputarr.length == 0) {
			return;
		}

		this.array = inputarr;
		length = inputarr.length;
		quicksort(0, length - 1);

	}

	public void quicksort(int lowerindex, int higherindex) {
		int i = lowerindex;
		int j = higherindex;
		int pivot = array[lowerindex + (higherindex - lowerindex) / 2];

		while (i <= j)

		{
			 /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */

			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchange(i, j);
				 //move index to next position on both sides
				j--;
				i++;
			}

		}

		if (lowerindex < j) {
			quicksort(lowerindex, j);

		}
		if (i < higherindex) {
			quicksort(i, higherindex);
		}
	}

	public void exchange(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String a[]) {

		QuickSort sorter = new QuickSort();
		int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99 };
		sorter.sort(input);
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

}
