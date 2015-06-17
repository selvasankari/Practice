package com.chella.practice.java;

public class ChildClass extends baseclass {
	
	public static void main(String args[])
	{
		baseclass a= new ChildClass();
		a.showData();
		a.show();
		baseclass obj = new ChildClass();
		obj.showData();
		obj.show();
	}
	
	public void showData1()
	{
	 super.showData();
		System.out.println("derived Class");
	}
	int add(int a, int b)
	{
		return a;
	}
	void add(int a,int b, int c)
	{
	}
	}



