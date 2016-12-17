package com.chella.practice.java;

public class ConstructorDemo {
	int value1;
	int y;
	
	ConstructorDemo()
	{
		System.out.println("INside a constructor");
		value1=10;
	}
	
	public void display()
	{
		System.out.println("the value of value1 is  " +value1);
		System.out.println("the value of y is  " +y);
	}

	public static void main(String args[]){
		ConstructorDemo obj = new ConstructorDemo();
	obj.display();
		
		
	}
}
