package com.chella.practice.java.abstrac;

class Rectangle extends Shape{
	   public static void main(String args[]){
	      Rectangle obj = new Rectangle();
	      obj.display();
	      obj.calculateArea();
	      System.out.println(obj.b);
	   }
	  public void calculateArea()
	  {
		  Shape s = new Rectangle();
		  System.out.println("Rectangle Area");
		   System.out.println(s.b *s.b);
	  }
	  
	}