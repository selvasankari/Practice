package com.chella.practice.string;

public class Permutation {

	public static void main(String args[]) {
		Permutation pm= new Permutation();
		pm.dopermute("","ABC");
		String x="ABC";
		System.out.println(x.substring(0,0));
		System.out.println(x.substring(1, x.length()));
		String s = "ABC";
		System.out.println("Hello" + s.substring(0,0));
		
		//fibonacci number
		
		pm.fibonacci(12);
		int fib = pm.fib_recur(12);
		System.out.println("the nth fib numbe is " +fib);
 
	}
	
	//nth fibanacci number and number of digits in fibonacci number
	
	public  void fibonacci(int n)
	{
		int a =0;
		int b=1;
		int c=0;;
		for(int i=0; i<n-1; i++)
		{
			c= a+b;
			a=b; 
			b=c;
		}
		System.out.println("the " + n +"th fibonacci number is " +c);
		int count =0;
		while(c!=0){
			c=c/10;
		 count ++; 
		}
	
		System.out.println("the number of digits in the fibonacci number is " +count);
		
	}
	//Fibonacci using recursion
	public int fib_recur(int n)
	{
		if(n==0 || n==1)
			return n;
		
		return fib_recur(n-1) + fib_recur(n-2);
	}
	
	public int numberOfDigits(int n)
	{
		if(n==1)
			return 1;
		
		return 1+ numberOfDigits(n/10);
		
		
	}

	public void dopermute(String prefix, String str) {

		int n = str.length();

		// Base condition
		if (n == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				dopermute(prefix+str.charAt(i), str.substring(0,i) + str.substring(i+1,n));
			}
		}
	}

}
