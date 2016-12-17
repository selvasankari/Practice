package com.chella.practice.java;

public class BitWiseOperator {
	
	public static void main(String args[])
	{
	int a =5;
	System.out.println(a<<2);
	toBinary(a<<2);
	toBinary(4<<2);
	int number =-8;
	number = number >>1;
	System.out.println(number);
	toBinary(number);
	number =8;
	number = number >>>1;
	System.out.println(number);
	toBinary(number);
	
	}
	
	public static void toBinary(int n) {
	       if (n == 0) {
	           System.out.println("0");
	       }
	       String binary = "";
	       while (n > 0) {
	           int rem = n % 2;
	           binary = rem + binary;
	           n = n / 2;
	       }
	       System.out.println(binary);
	       
	}
	
	

}
