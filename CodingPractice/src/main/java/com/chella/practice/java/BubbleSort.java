package com.chella.practice.java;

public class BubbleSort {
	/**
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] array1= {5,4,3,8,0,2,1,5};
		
		int temp,i;
		for( i=0; i<array1.length; i++)
		{
			for(int j=i+1; j<array1.length; j++)
			{
				if(array1[i]<array1[j])
				{
					temp =array1[i];
					array1[i]= array1[j];
					array1[j]= temp;
				}
			}
		}
			for(i=0; i<array1.length; i++)
			{
				System.out.println(array1[i]);
				//System.out.println("\n");
			}
		

	}

	
	
	*/
	
	  public void trailingZeroes(int n) {
	         int fact =1;
	         n=5;
	        for(int i=1; i<=n; i++)
	        {
	            fact = fact *i;
	            
	        }
	        System.out.println(fact);
	        int count =0;
	        while (fact%10==0)
	        {
	            count++;
	            fact =fact /10;
	            
	         }
	         
	         if(count >0)  
	           System.out.println(count);
	           else
	        	   System.out.println(0);
	        
	        
	    }
	
	
}
