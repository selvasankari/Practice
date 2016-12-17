package com.chella.practice.java.abstrac;

abstract public class Employee1  extends Employee {
	
	private String address;
	Employee1(String name, int eno, String address)
	{
		super(name, eno);
		this.address = address;
	}

}
