package com.chella.practice.java;

public class InstanceOfSubclass extends InstanceOf {
	public static void main(String args[])
	{
	InstanceOf obj= new InstanceOfSubclass();
	boolean result;
	result = obj instanceof InstanceOf;
	System.out.println(result);
	result = obj instanceof InstanceOfSubclass;
	System.out.println(result);
	
	int[] arrayList = {12, 13};
	System.out.println(arrayList.length);
	
	int[] arrayList1= new int[6];
	int arraylist2[] = new int[7];
	
	
	
	
	}

}
