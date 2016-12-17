package com.chella.practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.SortOrder;

public class ArraySum {

	public static void main(String args[]) {

		int iArr[] = {1, 4, 45, 6, 10, -8};
		Arrays.sort(iArr);
		int size = iArr.length;
		int n = 16;
		
		ArraySum obj = new ArraySum();
		boolean bool =obj.check(iArr,size,n);
		System.out.println(bool);
		
		int[] arr1 = {1,2,2,4,4,4,5};
		int[] arr2= {1,2,4,6};
		List l = obj. intersectArr(arr1, arr2);
	
	}
	
	//Intersection of two arrays
	
	public List intersectArr (int[] arr1, int[] arr2)
	{
		int m= arr1.length;
		int n= arr2.length;
		int size=0;
		
		if(m==0 || n==0)
			System.out.println("no intersection");
		
		List<Integer> l= new ArrayList<Integer>();
		
	
		int i=0;
		int j=0;
		
		while(i<m && j<n)
		{
			if(arr1[i] == arr2[j])
			{
				l.add(arr1[i]);
				//System.out.println(arr2[j]);
			i++;
			j++;
			}
			else if (arr1[i] >arr2[j])
				j++;
			else
				i++;
				
		}
		
	
		Iterator<Integer> lt= l.iterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		
		return l;

	}
	
	//Check whether any two numbers in an array forms the given sum

	public boolean check(int[] arr,int size ,int sum) {
		int left = 0;
		int right = size-1;
	

		while (left < right) {
			 			

			 if (arr[left] + arr[right] == sum) 
						return true;
			else if (arr[left] + arr[right] < sum)
				left++;
			else
				right--;
		}
		return false;
		}

	}

