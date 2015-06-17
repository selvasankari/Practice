package com.chella.practice.string;

public class DoubleChar {
	
	public static void main(String args[])
	{
		DoubleChar dc= new DoubleChar();
		// doubleChar 
		//String s = dc.doubleChar("the");
		//System.out.println(s);
		
		//dc.bobThere("b12b1b");
		boolean a =dc.xyBalance("xaxxbbyx");
		System.out.println(a);
	}

	/*Given a string, return a string where for every char in the original, there are two chars.
     doubleChar("The")  "TThhee"
	 doubleChar("AAbb")  "AAAAbbbb"
	 doubleChar("Hi-There")  "HHii--TThheerree" */
	public String doubleChar(String str) {
		if(str==null)
		{
		return "";
		}

		int size= str.length();
		String s="";
		for(int i=0; i<size;i++)
		{
		//s= s+str.substring(i, i+1)+str.substring(i, i+1);
		s= s+str.charAt(i)+str.charAt(i);
		}
		System.out.println(s);
		return s;
		}

	/** Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho")  1
countHi("ABChi hi") 2
countHi("hihi")  2*/
	
	public int countHi(String str) {

		if(str==null)
		return 0;

		int size= str.length();
		int count =0;

		for(int i=0; i<size-1; i=i+1)
		{
		if(str.substring(i,i+2) .equals("hi"))
		count++;
		}
		return count;
		  
		}
	
	public boolean endOther(String a, String b) {
		 a= a.toLowerCase();
		 b=b.toLowerCase();

		int a_len =a.length();
		int b_len =b.length();

		if(a_len>b_len)
		{
		if(a.endsWith(b))
		return true;
		}
		else
		{	if(b.endsWith(a))
			return true;
		}
			
		  return false;
		}
	/** Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz")  true
xyzThere("abc.xyz") false
xyzThere("xyz.abc")  true */
	
	public boolean xyzThere(String str) {
	    if (str.length() >= 3) {
	        if (str.substring(0,3).equals("xyz")) return true;
	        for (int i = 0; i < str.length()-3; i++)
	            if (str.substring(i+1, i+4).equals("xyz") && 
	                    str.charAt(i) != '.')
	                return true;
	    }
	    return false;
	}
	
	
	public boolean bobThere(String str) {

		int size = str.length();
		if(size==3)
		{ if((str.charAt(0) == 'b') && (str.charAt(2) =='b'))
			
		  return true;
		 }

		for(int i=0; i<size-2;i++)
		{ 
		  if((str.charAt(i) == 'b') && (str.charAt(i+2) =='b'))
			  System.out.println(i+ str.charAt(i)+ str.charAt(i+2));
		  return true;

		}
		return false;
		  
		}

	
	public boolean xyBalance(String str) {
		int len = str.length();
                boolean flag=false;
		if(len<2)
		return false;
		if((len == 2) && (str.charAt(0) == 'x') && (str.charAt(1) =='y'))
		return true;
		int xposition=0; int ypositon=0;

for(int i=0;i<len-1; i++)
{
	System.out.println("ivalue" +i);
	System.out.println(str.charAt(i));
	System.out.println(flag);
  if(str.charAt(i)=='x')
  {
	  xposition =i;
 	 System.out.println("xposition " +xposition);
    if(flag ==true && xposition >ypositon)
    {
    	System.out.println(flag);
     flag= false;
      break;
     }
    //xaxxbbyx
     for(int j=i+1; j<len; j++)
     {
    	 System.out.println( "jvalue "+j);
    		System.out.println(str.charAt(j));
       if(str.charAt(j) =='y')
       {
    	   ypositon=j;
    	   System.out.println("yposition " + ypositon);
    	   System.out.println(flag);
         flag =true;
        }
     }
   }  
}
if(str.charAt(len-1)=='x')
{
	return false;
}

return flag;

/**int lastX = str.lastIndexOf("y");
    int lastY = str.lastIndexOf("x");
    if (lastX == -1 && lastY == -1) return true;
    return (lastX > lastY);*/

}
	/**Given two strings, A and B, create a bigger string made of the first char of A, the first char of B, the second char of A, the second char of B, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz")  "axbycz"
mixString("Hi", "There")  "HTihere"
mixString("xxxx", "There") "xTxhxexre" **/
	
	public String mixString(String a, String b) {
		int alen = a.length();
		int blen = b.length();
		int i;

		int len=0;
		if((a=="" && b== "") || (a=="") ||(b==""))
		return a+b;

		if(alen>blen)
		{
		len =blen;
		}
		else
		{
		len =alen;
		}
		String s ="";
		for( i=0;i<len; i++)
		{
		s=s+a.charAt(i) + b.charAt(i);
		}

		if(alen>blen)
		s=s+a.substring(i);
		else
		s=s+b.substring(i);

		return s;  
		}
	
	/** String res = "";
    for (int i = 0; i < Math.min(a.length(), b.length()); i++)
        res += "" + a.charAt(i) + b.charAt(i);
    if (a.length() > b.length())
        return res + a.substring(b.length());
    return res + b.substring(a.length());*/
	
	/**Given a string and an int N, return a string made of N repetitions of the last N characters of the string. You may assume that N is between 0 and the length of the string, inclusive.

repeatEnd("Hello", 3) "llollollo"
repeatEnd("Hello", 2) "lolo"
repeatEnd("Hello", 1) "o"*/
	
	public String repeatEnd(String str, int n) {

		String result="";
		if(str== null)
		return str;
		 for(int i=0; i<n;i++)
		 {
		 result = result +str.substring(str.length()-n);
		 }
		 return result;
		  
		}
	/**Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

repeatFront("Chocolate", 4)  "ChocChoChC"
repeatFront("Chocolate", 3)  "ChoChC"
repeatFront("Ice Cream", 2)  "IcI"*/
	
	public String repeatFront(String str, int n) {

		String res= "";
		if(str=="")
		return str;

		for(int i=n; i>=0; i--)
		{
		res= res+str.substring(0,i);
		}
		return res;
		  
		}
	/**Given two strings, word and a separator, return a big string made of count occurences of the word, separated by the separator string.

repeatSeparator("Word", "X", 3)  "WordXWordXWord"
repeatSeparator("This", "And", 2)  "ThisAndThis"
repeatSeparator("This", "And", 1)  "This"*/
	
	public String repeatSeparator(String word, String sep, int count) {
		String result = "";
		for(int i = 0; i < count; i++) {
		if(i + 1 == count) {
		result += word;
		} else {
		result += (word + sep);
		}
		}
		return result;
		}
	/**Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) true
prefixAgain("abXYabc", 2) true
prefixAgain("abXYabc", 3) false*/

	
	public boolean prefixAgain(String str, int n) {

		String s= str.substring(0,n);
		if(str.length() == 2 && Character.toString(str.charAt(0)).equals(Character.toString(str.charAt(1)))) {
		return true;
		}

		for(int i=n;i <str.length()-n; i++)
		{
		 if((str.substring(i,i+n)).equals (s))
		 return true;
		}


		 return false;
		  
		}

}
