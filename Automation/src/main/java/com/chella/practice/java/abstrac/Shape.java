package com.chella.practice.java.abstrac;

abstract class Shape{
	   final int b = 20;
	   public void display(){
	     System.out.println("This is display method");
	   }
	   abstract public void calculateArea();
	}
