package com.chella.practice.string;




public class String1Exercise {
	
	public static void main (String args[])
	{
	 String1Exercise s = new String1Exercise();
	 s.helloName("cc");
	
	}
	
	//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	public String helloName (String name)
	{
		name = "Chella";
		System.out.println("Hello " + name );
		return "Hello " + name; 
	}

	
	//Given a string of any length, return a new string where the last 2 chars, 
	//if present, are swapped, so "coding" yields "codign".
	public String lastTwo(String str) {

		if(str== null || str.length()<2 )
		return str;

		int size= str.length();
		return str.substring(0,size-2) +  str.charAt(size-1) +  str.charAt(size-2);
		  
		}
	/*Given two strings, append them together (known as "concatenation")
	 *  and return the result. However, if the strings are different lengths, 
	 *  omit chars from the longer string so it is the same length as the shorter string.
	 *   So "Hello" and "Hi" yield "loHi". The strings may be any length. 
	 *   minCat("Hello", "Hi")  "loHi"
		minCat("Hello", "java")  "ellojava"
		minCat("java", "Hello")  "javaello"*/
	
	public String minCat(String a, String b) {
		int a_length =a.length();
		int b_length =b.length();

		if(a_length ==  b_length)
		{
		return a+b;
		}

		if(a_length >  b_length)
		{
		return a.substring(a_length-b_length) + b;
		}
		else
		{
		return a+ b.substring(b_length-a_length);
		}
		}

}

