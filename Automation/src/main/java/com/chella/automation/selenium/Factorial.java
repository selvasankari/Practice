package com.chella.automation.selenium;

public class Factorial {
	

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
	


