package com.chella.practice.java.interfac;

public class Inter_anony implements Animal {
	
	public void eat()
	{
		System.out.println("Man eats");
	}
	
	public void travel(String name)
	{
		System.out.println(name + " travels");
	}

	public static void main(String args[])
	{
		
		
	Animal anm = new Animal() {
		public void eat() {
			System.out.println("anonymous eats");
		}

		public void travel(String name) {
			System.out.println("anonymous travels");
		}
	};
	
	Animal ani= new Inter_anony();
	ani.eat();
	
	
	anm.eat();
			
	
	}
}
