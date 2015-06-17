package com.chella.practice.java;

public class Rectangle extends Shape {
	
	public void calculateArea()
	{
		System.out.println("Rectangle Area in Rectangle class");
	}
	public  void dis()
	{
		System.out.println("display method");
	}
	
	public static void main(String args[])
	{
		Rectangle s= new Rectangle();
		//s.calculateArea();
		//s.display();
		//s.reverse();
		//s.armstrong();
		//s.displayString();
		s.sumTest();
		
	}
	
	public void reverse()
	{
		String name=" i am a good girl  ";
		int size= name.length();
		System.out.println(size);
		String reversed_String="";
		for(int i=size-1; i>=0; i--)
		{
			reversed_String = reversed_String+name.charAt(i);
		}
		System.out.println(reversed_String);
		
	}
	
	public void armstrong()
	{
		int m;
		int n =153;
		int num=153;
		int sum=0;
		while(n!=0)
		{
			m=n%10;
			n=n/10;
			sum = sum +(m*m*m);
		}
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("normal number");
		}
		}
			
	public void displayString()
	{
		String text = "chella";
		int i=0; int j;
		int size = text.length();
				
		for (i=0; i<=size-1; i++)
		{
			for(j=0;j<=i;j++)
			{
			System.out.println(text.charAt(j) +"\t");
			}
			System.out.println("\n");
			
			
		}
			
	}
	
	public void sumTest()
	{
		int[] array= {1,2,3,4,5,6};
		int sum=5, i=0;
		int expected_sum=0;
		int[] newarry=findnum(array);
		for(i=0;i<6;i++)
		{
		System.out.println(newarry[i]);
		}
		int[] res =new int[6];;
		
		
		
		
		/**
		for(i=0; i<5;i++)
		{
			for(int j=0;expected_sum<=5;j++)
			{
				int base_number=array[i];
				if(expected_sum==5 || base_number==5)
				{
					System.out.println("hello"+i);
					break;
				}
				else
				{
					if (j!=i)
					expected_sum=base_number +array[j];
				}
			}
		}*/
	}
	
	public int[] findnum(int[] array)
	{
		int[] new_array=new int[6];
	
		for (int i=0; i<array.length; i++)
		{
			if(array[i]<=5)
			{
				new_array[i]=array[i];
				
			}
		}
		return new_array;
	}
}

			
	
		
	


