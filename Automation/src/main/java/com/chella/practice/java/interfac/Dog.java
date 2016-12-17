package com.chella.practice.java.interfac;

public class Dog implements Domestic, Animal{
	
	public void eat()
	{
		System.out.println("Dog eats");
	}
	
	public void travel(String name)
	{
		System.out.println(name + "walks");
	}
	public void noOfLegs(int n)
	{
		System.out.println("Dog has " + n + " legs");
	}
	
	public static void main(String args[])
	{
		Domestic d= new Dog();
		d.noOfLegs(4);
		
		Dog d1= new Dog();
		d1.eat();
		d1.travel("puppy ");
		d1.noOfLegs(4);
		
		Animal a = new Dog();
		a.eat();a.travel("dogg ");
		
	}
	

}
