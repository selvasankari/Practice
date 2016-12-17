package com.chella.practice.java.abstrac;

 public abstract class Employee {
	private String name;
	private int eno;
	
	Employee(String name, int eno)
	{
		this.name=name;
		this.eno=eno;
	}
	
	public void display()
	{
		System.out.println("name :" +name);
		System.out.println("eno " + eno);
	}
	 public void showData()
	{
		System.out.println("Abstract class Method");
	}

}
