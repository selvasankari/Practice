package com.chella.practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaPractice {
	int sum = 0;
	int fact = 1;

	public static void main(String args[]) {
		JavaPractice obj = new JavaPractice();
		int s = obj.addDigits(38);
		System.out.println("The added digit is " + s);
		// obj.x(65535);
		// prime
		boolean bool = obj.isPrimeCheck(17);
		if (bool)
			System.out.println("the given number is prime");
		else
			System.out.println("the given number is not prime");

		// primeRange
		System.out.println("Prime Range : ");
		obj.primeRange(2, 5);
		// Armstrong
		obj.armstrongnumber(407);

		// Common elements in array
		int a[] = { 2, 4, 6, 6, 3, 5, };
		int b[] = { 6, 4, 7, 6 };
		obj.commonElements(a, b);
		// swap two numbers
		obj.swapNumbers(5, 4);

		// fibonacci
		int n = 5;

		System.out.println("the fibonacci number is " + obj.fibonacci(6));
		// for (int i = 1; i <= 10; i++) {
		// int fib = obj.fibonacci(i);
		// System.out.println(fib + " ");
		// }

		// sum of numbers
		int res = obj.sumOfNumbers(12);
		System.out.println(res);

		// binary to decimal
		obj.binaryToDecimal(11);

		// distincty numbers in an array
		int[] distinctArray = { 1, 1, 2, 3, 4, 4 };
		obj.distinctNumbers(distinctArray);

		// find unique distinct element in a sorted array, its count and its
		// starting index
		int[] arr4 = { 1, 2, 2, 3, 3 };
		obj.findDistinctElements(arr4);

		// Factorial
		int fact_num = 3;
		int fact = obj.factorial(fact_num);
		System.out.println("The factorial of the given number " + fact_num
				+ " is " + fact);

		// MaxTwoNumbers
		int maxArray[] = { 5, 34, 78, 2, 45, 1, 99, 99, 23 };
		obj.maxTwoNumbers(maxArray);

		// Binary Search
		int[] binary_search_array = { 1, 2, 3, 4, 5, 6 };
		obj.binarySearch(binary_search_array, 5);
		int bn = obj.binarySearchRecursion(0, binary_search_array.length - 1,
				binary_search_array, 5);
		System.out.println(bn);
		main("chella");

	}

	public static void main(String s) {

		System.out.println(s);

	}

	public long x(long arg) {
		return (arg > 1) ? arg * x(arg - 1) : 1;
	}

	public void findDistinctElements(int arr[]) {
		int n = arr.length;
		int count = 1;
		int start_index = 0;
		int i;
		boolean startIndex = true;
		for (i = 1; i < n; i++) {
			if (arr[i - 1] == arr[i]) {
				count++;
				if (startIndex) {
					start_index = i - 1;
					startIndex = false;
				}
			} else {
				if (count > 1)
					break;
			}
		}
		System.out.println("The distince element is " + arr[i - 1]
				+ " starts at index " + start_index + " having count " + count);
	}

	// binary Search
	public void binarySearch(int arr[], int searchnum) {
		int n = arr.length;
		int first = 0;
		int last = n - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (arr[middle] < searchnum) {
				first = middle + 1;
			} else if (arr[middle] == searchnum) {
				System.out.println("the given num " + searchnum
						+ " is found in the postion " + (middle + 1));
				break;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}

		if (first > last) {
			System.out.println("The given number is not found in the list");
		}
	}

	public int binarySearchRecursion(int first, int last, int arr[],
			int searchnum) {

		while (last >= 1) {
			int middle = first + (last - 1) / 2;

			if (arr[middle] == searchnum)

				// System.out.println("the postion is " + middle);
				return middle;
			else if (arr[middle] > searchnum)
				return binarySearchRecursion(first, middle - 1, arr, searchnum);
			else
				return binarySearchRecursion(middle + 1, last, arr, searchnum);

		}
		return -1;

	}

	// Top two maximum numbers in an array
	public void maxTwoNumbers(int arr[]) {
		int maxOne = 0;
		int maxTwo = 0;
		int i = 0;

		for (int n : arr) {
			if (n > maxOne) {
				maxTwo = maxOne;
				maxOne = n;
			} else {
				if (n > maxTwo && n != maxOne)
					maxTwo = n;
			}

		}
		System.out
				.println("the maximum two numbers : " + maxOne + " " + maxTwo);

	}

	public int factorial(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		else
			return fact = fact * n * factorial(n - 1);

	}

	public void distinctNumbers(int arr[]) {
		if (arr.length == 0 || arr.length == 1) {
			System.out.println(arr[0]);
		}

		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length - 1; i++) {
			if (hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
			} else {
				hashMap.put(arr[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey().toString() + " : "
						+ entry.getValue());
			}
		}

	}

	public void binaryToDecimal(int binary) {
		int decimal = 0;
		int power = 0;

		while (true) {
			if (binary == 0)
				break;
			else {
				int temp = binary % 10;
				decimal = (int) (decimal + temp * Math.pow(2, power));
				power++;
				binary = binary / 10;
			}
		}
		System.out.println(decimal);

	}

	public int sumOfNumbers(int num) {

		if (num == 0)
			return num;
		else {
			sum = sum + (num % 10);
			sumOfNumbers(num / 10);
		}

		return sum;
	}

	public int fibonacci(int n) {
		if (n == 0)
			return 0;

		if (n == 1 || n == 2)
			return 1;
		else {
			return sum = fibonacci(n - 1) + fibonacci(n - 2);
		}

		/*
		 * with out using recursion function int febCount = 15; int[] feb = new
		 * int[febCount]; feb[0] = 0; feb[1] = 1; for(int i=2; i < febCount;
		 * i++){ feb[i] = feb[i-1] + feb[i-2]; }
		 * 
		 * int a, b, c=0, count; a=0; b=1; while(count<n) { c=a+b; a=b; b=c;
		 * count++; }
		 */

	}

	public void swapNumbers(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a : " + a);
		System.out.println("b : " + b);

	}

	public void commonElements(int a[], int b[]) {
		int a1 = a.length;
		int b1 = b.length;
		Arrays.sort(a);
		Arrays.sort(b);
		int i = 0, j = 0;
		Set<Integer> set = new HashSet<Integer>();

		while (i < a1 && j < b1) {
			if (a[i] == b[j]) {
				set.add(a[i]);
				i++;
				j++;
			} else if (a[i] > b[j])
				j++;
			else
				i++;
		}

		Iterator ite = set.iterator();
		while (ite.hasNext())
			System.out.println(ite.next());

	}

	public int addDigits(int num) {

		int sum = 0;
		if (num < 10) {
            return num;
        }

		while (num != 0) {

			int mod = num % 10;
			num = num / 10;
			sum = sum + mod;

		}
		if (sum < 10) 
			return sum;

		 else
			 return addDigits(sum);
		

	}

	public int[] intersection(int[] nums1, int[] nums2) {

		HashSet<Integer> set1 = new HashSet<Integer>();
		for (int n : nums1) {
			set1.add(n);

		}

		HashSet<Integer> set2 = new HashSet<Integer>();
		for (int m : nums2) {
			if (set1.contains(m))
				set2.add(m);
		}

		int[] result = new int[set2.size()];

		int i = 0;
		for (int k : set2) {
			result[i++] = k;
		}

		return result;

	}

	public void armstrongnumber(int n) {
		int number = n;
		int r, s = 0;
		while (number != 0) {
			r = number % 10;
			number = number / 10;
			s = s + r * r * r;
		}

		if (s == n) {
			System.out.println("Number " + n + " is an armstrong number.");
		} else {
			System.out.println("Number " + n + " is not an armstrong number.");
		}
	}

	public void primeRange(int start, int end) {

		for (int i = start; i <= end; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					flag = false;

				}
			}

			if (flag)
				System.out.println(i + " ");
		}
	}

	public boolean isPrimeCheck(int number) {
		for (int i = 2; i < Math.sqrt(number); i++) {
			// for(int i=2; i<num/2;i++) -- another conditiont to check whehter
			// the numnber is prime
			if (number % i == 0) {

				return false;
			}

		}
		return true;

	}

}
