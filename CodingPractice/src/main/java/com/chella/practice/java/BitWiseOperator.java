package com.chella.practice.java;

public class BitWiseOperator {
	
	public static void main(String args[])
	{
	int a =5;
	
	// << left shift
	System.out.println(a<<2);
	System.out.println(a<<3);
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
	System.out.println("signed bit examples");
	  int x = -4;
      toBinary(x>>1);   
      int y = 4;
      toBinary(y>>1);  
	
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
