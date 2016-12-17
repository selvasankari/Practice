package com.chella.practice.string;

public class CodingBatString1 {
	/**
	 * public String makeOutWord(String out, String word) {
	 * 
	 * String str = out.substring(0,2) + word + out.substring(2); return str;
	 * 
	 * }
	 **/

	public String makeOutWord(String out, String word) {
		String str = out.substring(0, 2) + word + out.substring(2);
		return str;

	}

	/*
	 * extraEnd("Hello") → "lololo" extraEnd("ab") → "ababab" extraEnd("Hi") →
	 * "HiHiHi"*
	 */
	public String extraEnd(String str) {

		int size = str.length();
		String newstr = str.substring(size - 2);
		return newstr + newstr + newstr;

	}
/**
 * firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"

 */
	public String firstTwo(String str) {
		  if(str.length() <2)
		  return str;
		  else
		  return str.substring(0,2);
		  
		}
	/**
	 * firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"

	 */
	public String firstHalf(String str) {
		return str.substring(0,str.length()/2);
		  
		  
		}
	/**
	 * 
withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
	 * @param str
	 * @return
	 */
	public String withouEnd2(String str) {
		  if(str.length()<=2)
		  return "";
		  else
		  return (str.substring(1,str.length()-1));
		  
		}
	/**
	 * 
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
	 */
	public boolean endsLy(String str) {
		  if(str.length() <2)
		  return false;
		  if(str.substring(str.length()-2).equals ("ly"))
		  return true;
		  else 
		  return false;
		  
		}
	/**
	 * nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
	 * @param str
	 * @param n
	 * @return
	 */
	public String nTwice(String str, int n) {
		  String newstr=  str.substring(0,n) +str.substring(str.length()-n);
		  return newstr;
		  
		}
		/**
		 * twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
		 * @param str
		 * @param index
		 * @return
		 */
	public String twoChar(String str, int index) {
		  int size =str.length();
		  if(size -index <=1 || index<0)
		  return str.substring(0,2);
		  else
		  return str.substring(index, index+2);
		  
		  
		}



}
