package com.chella.practice.string;

public class StringArrayExample {
	
	public static void main(String args[]) {


	      // declare a string array with initial size

	      String[] schoolbag = new String[4];

	 

	      // add elements to the array

	      schoolbag[0] = "Books";

	     schoolbag[1] = "Pens";

	     schoolbag[2] = "Pencils";

	        schoolbag[3] = "Notebooks";

	 

	        // this will cause ArrayIndexOutOfBoundsException

	        // schoolbag[4] = "Notebooks";

	 

	        // declare a string array with no initial size

	        // String[] schoolbag;

	 

	        // declare string array and initialize with values in one step

	        String[] schoolbag2 = { "Books", "Pens", "Pencils", "Notebooks" };

	 

	        // print the third element of the string array

	        System.out.println("The third element is: " + schoolbag2[2]);

	 

	        // iterate all the elements of the array

	        int size = schoolbag2.length;

	        System.out.println("The size of array is: " + size);

	        for (int i = 0; i < size; i++) {

	            System.out.println("Index[" + i + "] = " + schoolbag2[i]);

	        }

	 

	        // iteration provided by Java 5 or later

	        for (String str : schoolbag2) {

	            System.out.println(str);

	        }
	        String Str = new String("Welcome to Tutorialspoint.com");

	        System.out.print("Return Value :" );
	        System.out.println(Str.substring(10) );

	        System.out.print("Return Value :" );
	        System.out.println(Str.substring(10, 15) );
	 

	    }
	
	 

	}