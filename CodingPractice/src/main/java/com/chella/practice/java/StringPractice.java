package com.chella.practice.java;

import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.ReverbType;

import com.chella.practice.java.InstanceOf;

public class StringPractice {

	public static void main(String args[]) {
		StringPractice obj = new StringPractice();

		// palindrome
		System.out.println("Palindrome");
		boolean bool = obj.isPalindrome("ma%%am");
		System.out.println(bool);
		obj.printDuplicateCharacters("chellalla");

		// Reverse String
		String str = obj.reverseString("chella");
		System.out.println(" the reverse string is " + str);

		// Reverse String with out Palindrome
		obj.reverseStringWithoutRecursion("Chella");

		// Integer to String
		String st = "" + 123;
		System.out.println(st);
		String s = String.valueOf(123);
		System.out.println(s instanceof String);
		System.out
				.println(new StringBuffer().append(" ").append(10).toString());

		String strg = obj.swapCharacters("abcdefghij");
		System.out.println(strg);
		System.out.println(strg.charAt(2));

		// Longest Palindrome
		obj.longestPalindrome("madam");

		// isPalindromeString
		obj.ispalindromeString("Madam");
		obj.ispalindromeString("aabbccddab");
		obj.ispalindromeString("aabbcc");

		// Palindrome - Normal Method
		obj.palindromeCheck("madamf");

		// Reverse position on word
		obj.reverseWordPosition("Selva Venkat");
		
		//Pair Strings
		String pairString = "abc cdb cba ssfsd bdc addfdfd";
		obj.pairStrings(pairString);
	}
	
	public void pairStrings(String str)
	{
		String[] splitString = str.split("//s+");
		int size = splitString.length;
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		for(int i=0; i<size-1; i++)
		{
			hashMap.put(splitString[i], 1);
		}
		
		for(int i=0 ;i<size-1; i++)
		{
			System.out.println(new StringBuffer(splitString[i]).reverse().toString());
			if(hashMap.containsKey(new StringBuffer(splitString[i]).reverse().toString()))	
			{
				System.out.println(splitString[i] + " " + new StringBuffer(splitString[i]).reverse().toString());
				
			}
		}
		
	}

	public void reverseWordPosition(String str) {
		StringBuilder sb = new StringBuilder();
		String[] split = str.split("\\s+");
		int size = split.length;
System.out.println("reverseWordPosition");
		for (int i = 0; i < size; i++) {
			// System.out.println(split[size-i-1]);
			sb.append(split[size - 1 - i]).append(" ");
		}
		System.out.println(sb.toString());
	}

	public void palindromeCheck(String str) {
		boolean ispalindrome = true;
		if (str == null)
			System.out.println("The String is null");

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				ispalindrome = false;
				break;
			}
		}
		if (ispalindrome) {
			System.out.println("Palindrome");
		} else
			System.out.println("not a Palindrome");
	}

	public void ispalindromeString(String str) {
		String str1 = str.toLowerCase();
		char[] char_array = str1.toCharArray();
		HashMap<Character, Integer> characterhashMap = new HashMap<Character, Integer>();

		for (Character c : char_array) {
			if (characterhashMap.containsKey(c)) {
				characterhashMap.put(c, characterhashMap.get(c) + 1);
			} else {
				characterhashMap.put(c, 1);
			}
		}
		int oddModCount = 0;

		for (Map.Entry<Character, Integer> entry : characterhashMap.entrySet()) {

			if (entry.getValue() % 2 == 1) {
				oddModCount++;

			}

		}
		if (oddModCount >= 2) {
			System.out.println("The given string can not form palindrome");
		} else {
			System.out.println("The given String can from Palindrome");
		}
	}

	public void longestPalindrome(String s) {

		int maxPalinLength = 0;
		String longestPalindrome = null;
		int length = s.length();

		// check all possible sub strings
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				int len = j - i;
				String curr = s.substring(i, j + 1);
				if (isPalindrome(curr)) {
					if (len > maxPalinLength) {
						longestPalindrome = curr;
						maxPalinLength = len;
					}
				}
			}
		}

		System.out.println("Longest Palindrome is " + longestPalindrome);
	}

	public String swapCharacters(String str) {
		int n = str.length();
		return str.substring(2, 3) + str.charAt(1) + str.charAt(0)
				+ str.substring(3, str.length() - 3) + str.charAt(n - 1)
				+ str.charAt(n - 2) + str.charAt(n - 3);

	}

	public static boolean isPalindrome(String s) {
		if (s.length() == 0 || s.length() == 1)
			// if length =0 OR 1 then it is
			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1))
			// check for first and last char of String:
			// if they are same then do the same thing for a substring
			// with first and last char removed. and carry on this
			// until you string completes or condition fails
			return isPalindrome(s.substring(1, s.length() - 1));

		// if its not the case than string is not.
		return false;
	}

	public String reverseString(String str) {
		int n = str.length();
		if (n <= 1)
			return str;
		return (str.substring(n - 1) + reverseString(str.substring(0, n - 1)));

	}

	public void reverseStringWithoutRecursion(String str) {
		int n = str.length();
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public void printDuplicateCharacters(String str) {
		char[] input_string = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (Character ch : input_string) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		// Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();

		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out
						.println(entry.getKey().toString() + entry.getValue());
			}
		}

	}

}
