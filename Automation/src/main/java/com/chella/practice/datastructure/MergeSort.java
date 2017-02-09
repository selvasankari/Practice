package com.chella.practice.datastructure;

import java.util.Arrays;

public class MergeSort {
	private int arr[];
	private int length;
	private int tempMergArr[];

	public void sort(int[] inputArr) {
		this.arr = inputArr;
		this.length = arr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length-1);

	}
	private void doMergeSort(int lowerIndex, int higherIndex)
	{
		if(lowerIndex<higherIndex)
		{
			int middle = (lowerIndex+higherIndex)/2;
			doMergeSort(lowerIndex, middle);
			doMergeSort(middle+1, higherIndex);
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}
	
	private void mergeParts(int lowerIndex, int middle, int higherIndex)
	{
		for(int i=lowerIndex; i<=higherIndex; i++)
		{
			tempMergArr[i]=arr[i];
		}
		int low =lowerIndex;
		int mid= middle+1;
		int k=lowerIndex;
		while(low<=middle && mid <=higherIndex)
		{
			if(tempMergArr[low] <=tempMergArr[mid])
			{
				arr[k]=tempMergArr[low];
				low++;
			}
			else
			{
				arr[k]=tempMergArr[mid];
				mid++;
			}
			k++;
				
		}
		while(low<=middle)
		{
			arr[k]=tempMergArr[low];
			k++;
			low++;
		}
	}
	
	public static void main(String args[])
	{
		int[] inputArr = { 25, 8, 90, 1, 54, 9, 23, 4, 9, 5 };
		MergeSort mms = new MergeSort();
		mms.sort(inputArr);
		System.out.println(Arrays.toString(inputArr));
		
	}
}
