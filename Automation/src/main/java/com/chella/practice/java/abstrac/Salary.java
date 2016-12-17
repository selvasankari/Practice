package com.chella.practice.java.abstrac;

public class Salary extends Employee{
	private int salary;
	
	Salary(String name, int eno,int salary)
	{
		super(name, eno);
		this.salary= salary;
	}
	public void display()
	{
		super.display();
		System.out.println("salary " + salary);
	} 
	

}
