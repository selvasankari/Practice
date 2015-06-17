package com.chella.practice.string;

import java.util.Arrays;

public class DuplicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,3,3,4,4,6,6,6,3,3,4,5,5,9};
		int temp,i,j,k=0;
		int dup_count=0;
		Arrays.sort(array);
		/**
		//Sorting
		for( i=0; i<array.length; i++)
		{
			for( j=i+1; j<array.length; j++)
			{
				if(array[i]<array[j])
				{
					temp =array[i];
					array[i]= array[j];
					array[j]= temp;
				}
			}
		}
		*/
		
		DuplicateCount d=  new DuplicateCount();
		int [] dup_array =null;
		
		// compare and store the highest count
		
		for (i=0; i<array.length-1; i++)
		{
		
				if(array[i] == array[i+1])
				{
					dup_count++;
					//System.out.println(dup_count);
							continue;
				}						
				d.dupcount(dup_count, array[i]);
			}
		d.dupcount(dup_count, array[i]);
	
	}





public int  dupcount(int count, int i)
{
	if(count>0)
	{
		System.out.println(i);
		
	}
	return 0;
}
}
