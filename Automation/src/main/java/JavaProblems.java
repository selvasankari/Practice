import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.Odd;
import org.apache.poi.util.SystemOutLogger;

public class JavaProblems {

	public static void main(String args[]) {
		JavaProblems obj = new JavaProblems();

		/**********************************************************************************************/

		// Check whether the given number is power of 2
		boolean powerofTwo = obj.powerOfTwo(4); // 0100 & 0011
		System.out.println("the given number is powerofTwo : " + powerofTwo);
		powerofTwo = obj.powerOfTwo(5); // 0101 & 0100
		System.out.println("the given number is powerofTwo : " + powerofTwo);

		/**********************************************************************************************/

		// Check whether the given number is power of 2
		boolean powerofThree = obj.powerOfThree(81);
		System.out.println("the given number is powerofThree :  " + powerofThree);
		powerofThree = obj.powerOfThree(5);
		System.out.println("the given number is powerofThree : " + powerofThree);

		/**********************************************************************************************/

		// Check whether the given number is even or odd
		boolean oddOrEven = obj.oddOrEven(2); // 0010 & 0001
		System.out.println("the given number is even : " + oddOrEven);
		oddOrEven = obj.oddOrEven(7); // 0111 & 0001
		System.out.println("the given number is even : " + oddOrEven);

		/**********************************************************************************************/

		// Maximum distance between two occurrences of same element in array
		// Input : arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
		// Output: 10
		// maximum distance for 2 is 11-1 = 10
		// maximum distance for 1 is 4-2 = 2
		// maximum distance for 4 is 10-5 = 5
		int maxDistArr[] = { 9, 1, 2, 3, 4, 5, 2, 5, 2, 9 };
		System.out.println("Maximum distance between two occurrences of same element in array ");
		System.out.println(obj.maxDistanceInArray(maxDistArr));

		/**********************************************************************************************/

		// Find elements larger than half of the elements in an array

		int largerElements[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		obj.largerElements(largerElements);

		/**********************************************************************************************/

		// Given a positive integer, return its corresponding column title as
		// appear in an Excel sheet.
		/*
		 * 1 -> A 2 -> B 3 -> C ... 26 -> Z 27 -> AA 28 -> AB
		 */

		int excelTitleNum = 27;
		obj.excelTitle(excelTitleNum);

		/**********************************************************************************************/

		// Binary to Decimal
		obj.binaryToDecimal(001);
		obj.binaryToDecimal(1000);

		/**********************************************************************************************/

		// sum of n numbers
		obj.sumOfNumbers(32);

		/**********************************************************************************************/

		obj.paiseMatch(Arrays.asList(new Integer[] { 50, 25, 10, 5, 1 }), 117);

		/**********************************************************************************************/

		int arr[] = { 7, 9, 5, 6, 3, 2 };
		int size = arr.length;
		System.out.println("MaximumDifference is " + obj.maxDiff(arr, size));

		obj.stringCalculator("1+2");
		obj.stringCalculator("1+2-3");

		//// Count the number of unique elements
		int uniqueArr[] = { 1, 2, 2, 3, 4, 5, 5 };

		System.out.println(obj.countUnique(uniqueArr));
	}

	// Count the number of unique elements

	// Count the number of unique elements
	public int countUnique(int[] A) {
		int count = 0;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] == A[i + 1]) {
				count++;
			}
		}
		return (A.length - count);
	}

	/*
	 * The function assumes that there are at least two elements in array. The
	 * function returns a negative value if the array is sorted in decreasing
	 * order. Returns 0 if elements are equal
	 */
	int maxDiff(int arr[], int arr_size) {
		int max_diff = arr[1] - arr[0];
		int min_element = arr[0];
		int i;
		for (i = 1; i < arr_size; i++) {
			if (arr[i] - min_element > max_diff)
				max_diff = arr[i] - min_element;
			if (arr[i] < min_element)
				min_element = arr[i];
		}
		return max_diff;
	}

	/**
	 * int maxDiff(int arr[], int arr_size) { int max_diff = arr[1] - arr[0];
	 * int min_element = arr[0]; int i; for (i = 1; i < arr_size; i++) { if
	 * (arr[i] - min_element > max_diff) max_diff = arr[i] - min_element; if
	 * (arr[i] < min_element) min_element = arr[i]; } return max_diff; }
	 */

	public void stringCalculator(String str) {
		char ch = str.charAt(0);
		int res = Character.getNumericValue(ch);
		for (int i = 1; i < str.length(); i++) {
			int l = Character.getNumericValue(str.charAt(i + 1));
			if (str.charAt(i) == '+')

			{
				res = res + l;
				i++;
			} else {
				res = res - l;
				i++;
			}

			if (i == i + 1) {
				break;
			}
		}
		System.out.println("The result is " + res);
	}

	public void sumOfNumbers(int num) {
		int sum = 0;

		// int sum_using_formula= (num * (num+1))/2;

		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}

		System.out.println("the sum of the numbers " + sum);
		// System.out.println("sum using formula " + sum_using_formula);
	}

	public void paiseMatch(List<Integer> list, int target) {

		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			Integer currentDem = list.get(i);
			while (target >= currentDem) {
				target = target - currentDem;
				count++;
			}
			map.put(currentDem, count);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry);
		}

	}

	public void binaryToDecimal(int binary) {
		int decimal = 0;
		int pow = 0;

		while (true) {
			if (binary == 0)
				break;
			int rem = binary % 10;
			decimal = (int) (decimal + (rem * Math.pow(2, pow)));
			pow++;
			binary = binary / 10;
		}
		System.out.println("The decimal number is " + decimal);
	}

	// Given a positive integer, return its corresponding column title as appear
	// in an Excel sheet.

	public void excelTitle(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("Invalid input");
		}

		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			n--;
			char c = (char) (n % 26 + 'A');
			sb.append(c);
			n = n / 26;
		}
		sb.reverse();

		System.out.println("The excelTitle is " + sb.toString());
	}

	// Check whether the given number is power of 2
	public boolean powerOfTwo(int n) {
		if ((n & (n - 1)) == 0)
			return true;
		else
			return false;
	}

	// Check whether the given number is power of 3
	public boolean powerOfThree(int n) {
		if (n == 1)
			return true;

		while (n != 0) {
			int mod = n % 3;

			if (mod == 0) {
				n = n / 3;
				if (n == 1)
					return true;
			} else
				return false;
		}
		return false;
	}

	// Check whether the given number is even or odd
	public boolean oddOrEven(int n) {
		if ((n & 1) == 0)
			return true;
		else
			return false;
	}

	// Maximum distance between two occurrences of same element in array
	public int maxDistanceInArray(int arr[]) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max_dist = 0;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int index = map.get(arr[i]);
				int dist = i - index + 1;
				if (dist > max_dist)
					max_dist = dist;
			} else
				map.put(arr[i], i);
		}

		return max_dist;

	}

	// Find elements larger than half of the elements in an array

	public void largerElements(int nums[]) {

		Arrays.sort(nums);
		int n = nums.length;
		System.out.println("elements larger than half of the elements in an array ");
		for (int i = n / 2; i < n; i++)
			System.out.print(nums[i] + " ");

	}
}
