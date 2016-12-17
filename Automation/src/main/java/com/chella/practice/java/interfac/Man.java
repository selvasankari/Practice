package com.chella.practice.java.interfac;

public class Man implements Mammal{
	
	public void eat()
	{
		System.out.println("Man eats");
	}
	
	public void travel(String name)
	{
		System.out.println(name + " travels");
	}
	
	public void noOfLegs()
	{
		System.out.println("A man has 4 legs");
	}
	
	public static void main(String args[])
	{
		Mammal mam= new Man();
		System.out.println("Selva");
		mam.eat();mam.travel("selva");mam.noOfLegs();
		
		Animal an= new Man();
		System.out.println("chella");
		an.eat();an.travel("chella");
	}
	
	

}
