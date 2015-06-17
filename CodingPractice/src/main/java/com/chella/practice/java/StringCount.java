package com.chella.practice.java;

public class StringCount {
	
	public static void main (String args[])
	{
		char a[]= {'a', 'a', 'b','b','b','b','a','a'};
		
	String str=new String(a);
	int len = str.length(); 
	int count=1;
	//System.out.println("length is " +len);
	for (int i=0;i<len;i++)
	{
		if(str.charAt(i)==str.charAt(i+1))
	
		{
			//System.out.println(str.charAt(i));
			count++;
			
			//System.out.println(count);
		}
		else
		{
			System.out.println(str.charAt(i));
			System.out.println(count);
			count=1;
			
		}
	}
	
	
}
}
