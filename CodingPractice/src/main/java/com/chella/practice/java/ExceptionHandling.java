package com.chella.practice.java;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0;
		int number = 100;
		try
		{
		int result = number/d;
		System.out.println(result);
		}
		
		catch(ArithmeticException exception)
		{
			System.out.println("catch block");
			System.out.println(exception.getMessage());
		}
		
		catch (Exception e)
		{
		System.out.println("second catch block");
		System.out.println(e.getMessage());
		}
		
		finally{
			System.out.println("finally block");
		}
		

	}

}
