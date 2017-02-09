package com.chella.practice.java;


import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class FirstNonRepeated {
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
       // System.out.println(" Please enter the input string :" );
       // Scanner in = new Scanner (System.in);
        //String s=in.nextLine();
      //  char c=firstNonRepeatedCharacter(s);
       // System.out.println("The first non repeated character is :  " + c);
        
        FirstNonRepeated obj = new FirstNonRepeated();
        
        int res = obj.firstUniqChar("aadadaad");
        		System.out.println(res);
    }
    
    
    public static Character firstNonRepeatedCharacter(String str)
    {
     //   HashMap<Character,Integer>  characterhashtable= new HashMap<Character ,Integer>();
        Hashtable<Character,Integer>  characterhashtable = new Hashtable<Character,Integer>();
        int i,length ;
        Character c ;
        length= str.length();  // Scan string and build hash table
        for (i=0;i < length;i++)
        {
            c=str.charAt(i);
            if(characterhashtable.containsKey(c))
            {
                // increment count corresponding to c
                characterhashtable.put(  c ,  characterhashtable.get(c) +1 );
            }
            else
            {
                characterhashtable.put( c , 1 ) ;
            }
        }
        // Search characterhashtable in in order of string str
        
        for (i =0 ; i < length ; i++ )
        {
            c= str.charAt(i);
            System.out.println(characterhashtable.get(c));
            if( characterhashtable.get(c)  == 1 )
            return c;
        }
        return null ;
    }
    
 public int firstUniqChar(String s) {
        
        if(s== null)
        return 0;
        Character c ;
      Map<Character,Integer>  map = new LinkedHashMap<Character,Integer>();
        
      for(int i=0; i<s.length(); i++)
      {
    	  c=s.charAt(i);
       if(map.containsKey(s.charAt(i)))
       {
        map.put(s.charAt(i), map.get(c)+1);
       }
       else
       {
           map.put(s.charAt(i), i);
       }
          
      }
      
      if(map.isEmpty())
          return -1;
          else
          {
          
         //Set<Entry<Character, Integer>> entry =map.entrySet();
          Map.Entry<Character, Integer> en= (Entry<Character, Integer>) map.entrySet();
          
          
        //  char firstchar =entry.getKey();
         //s int index = entry.getValue();
       
          return 0 ;
          }
        
    }
} 

