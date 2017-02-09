
public class StringPractice {
	
	public static void main(String args[])
	{
		StringPractice obj = new StringPractice();
		int len =obj.lengthofLastWord("chella chella");
		System.out.println("the length of the last word in the string is " +len);
	}

	
	public int lengthofLastWord(String s)
	{
		int len=0;
		if(s==null || s== " ")
			return 0;
		String[] splitString = s.split(" ");
		len=splitString.length;
		//System.out.println(len);
		if(splitString.length ==1)
			return splitString[0].length();
		else
		{
			len=splitString[len-1].length();
		}
		return len;
	}
	
	//Another way
	/*public int lengthOfLastWord(String s) {
 2          if (s == null || s.length() == 0)   
 3             return 0;  
 4           
 5         int len = s.length();  
 6         int count = 0;  
 7         for (int i = len - 1; i >= 0; i--) {  
 8             if (s.charAt(i) != ' ') {  
 9                 count++;  
10             }  
11             if(s.charAt(i)==' '&&count != 0){  
12                 return count;  
13             }  
14         }  
15         return count;  
16     }

*/
	

}
