package com.chella.practice.java.algo;

public class BinarySearch {
	
	public static void main(String args[])
	{
	
	int array[] = {-1,1,2,3,4,5,6,7};
	BinarySearch bn = new BinarySearch();
	int result = bn.binarySearch(array, 4);
	System.out.println(result);
	
	result = bn.binarySearch(array, -1);
	System.out.println(result);
	

	}
	
	public int  binarySearch(int[] arr, int search)
	{
		int len = arr.length;
				
		int first = 0;
		int last = len-1;
		int middle = (last + first)/2;
		
		while(first <= last)
		{
			if(arr[middle]< search)
			{
				first= middle+1;
			}
			else if(arr[middle] == search)
			{
				return (middle+1);
				//break;
			}
			else
			{
				last =middle -1;
			}
			middle = (last + first)/2;
		}
		
		//if(first > last)
		//{
		//	return 0;
		//}
		
		return 0;
	}

}
