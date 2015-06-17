package com.chella.practice.string;

import java.util.Arrays;

public class LongestPositiveNumber {
	public static void main (String args[])
	{
		final int [] array = {-2,-3,5,6,-1,7,6,9,-9,8};
		int large=0;
		  int temp,j=0;
		  int index=0;
		 
	    //Arrays.sort(array);
		//System.out.println(array[array.length-1]);
		for (int i=0;i<array.length;i++)
		{
			for ( j=i+1; j<array.length;j++)
			{
		
			if(array[i] >array[j])
			{
				temp =array[i];
				array[i]= array[j];
				array[j]= temp;
				large =array[j];
				index=i;
		
		    }
			}

		}
		System.out.println(large);
		System.out.println(index);
		}

}
