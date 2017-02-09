import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class StringProblems {

	public static void main(String args[]) {
		StringProblems obj = new StringProblems();

		// Permutation
		System.out.println("The permutaion are : ");
		obj.permutation("", "ABC");

		// check whether the given string is palindrome
		String palindrome_str = "MAAM";
		Boolean palin_res = obj.isPalindrome(palindrome_str);
		System.out.println("the given string " + palindrome_str + "is Palindrome " + palin_res);

		// Longest Palindrome
		String longestPalindrome = "MAAM";
		obj.longestPalindrome(longestPalindrome);

		// Reverse String
		String reverse_string = "MAS";
		System.out.println("The reversed string is " + obj.reverseString(reverse_string));
		
		
		//To print the duplicate characters in the given string
		obj.printDuplicateCharacters("chellaa");

		
		//Reverse String
		obj.reverseWords("Chella Venkat");
		
		System.out.println(obj.gHappy("xxggxx"));
	}
	
	/**
	 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
	 * @param str
	 */
	

    public boolean gHappy(String str) 
  {
        for(int i=1;i<str.length()-1;i++)
           {
              if(str.charAt(i)=='g')
              {
            	  char c = str.charAt(i-1);
            	  char ch = str.charAt(i+1);
                 if(str.charAt(i-1)!='g'&&str.charAt(i+1)!='g')
                    return false;
                 
              }
  }                   
  if(str.length()==1)
      return false;
  if(str.equals(""))
      return true;
if(str.charAt(str.length()-1)=='g')
      if(str.charAt(str.length()-2)!='g')
        return false;

  return true;
}
	public void reverseWords(String str)
	{
		if(str.isEmpty())
			System.out.println("String is empty");
		
		String str_arr[]= str.split(" ");
		int len = str_arr.length;
		StringBuilder sb= new StringBuilder();
		
		for(int i=len-1;i>=0;i--)
		{
			sb.append(str_arr[i] + " " );
			
		}
		System.out.println(sb.toString());
	}
	//To print the duplicate characters in the given string
	public void printDuplicateCharacters(String str)
	{
		if(str.isEmpty())
			System.out.println("Empty String");
		
		Map <Character,Integer> map = new HashMap<Character, Integer>();
		char char_arr[] = str.toCharArray();
		
		for(char c : char_arr)
		{
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>1)
				System.out.println(entry);
			
		}
	}
	
	
	// reverse a string

	public String reverseString(String str) {
		if (str == null || str.isEmpty())
			return str;

		int n = str.length();

		return str.charAt(n - 1) + reverseString(str.substring(0, n - 1));

	}

	public void longestPalindrome(String str) {
		int len = str.length();

		if (str == null || len == 0)
			System.out.println("the String is empty");

		int maxlen = 0;
		String longestPalindrome = null;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				String curr = str.substring(i, j + 1);
				int curr_len = curr.length();
				if (isPalindrome(curr)) {
					if (maxlen < curr_len) {
						maxlen = curr_len;

						longestPalindrome = curr;
					}
				}

			}
		}
		System.out.println("The longest Palindrome is " + longestPalindrome + " and the length is " + maxlen);
	}

	public boolean isPalindrome(String str) {

		if (str == null || str.isEmpty())

			return true;
		int len = str.length();

		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}

	// Permutation
	public void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++) {
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
		}
	}

}
