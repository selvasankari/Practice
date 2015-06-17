package com.chella.practice.java;

public class PrintingArray {
public static void main(String args[])
{
	int[][] array_list = new int[5][4];
	int i; int j;
	
	for(i=0; i<=4;i++)
	{
		for(j=0;j<=3;j++)
		{
			array_list[i][j] = i;
			System.out.println("\t"+i);
		}
		System.out.println("\t");
	}
	
	
	
}
}
