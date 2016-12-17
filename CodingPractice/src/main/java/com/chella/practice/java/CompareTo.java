package com.chella.practice.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.Set;

public class CompareTo {
	public static void main(String args[]) {
		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("India", 1);
		hashmap.put("USA", 2);
		hashmap.put("Mauritius", 3);

		Set<Entry<String, Integer>> set = hashmap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
				set);

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,
					Map.Entry<String, Integer> o2) {
				return (o2.getValue().compareTo(o1.getValue()));
			}
		});

		for (Map.Entry<String, Integer> entry : list)

		{
			System.out.println(entry.getKey() + "=== " + entry.getValue());
		}
		
		
		//Treeset
		Set  s= new TreeSet <String>();
		s.add("chella");
		s.add("nee");
		s.add("apple");
		Iterator ite =s.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		
		
		
		
		

	}

}
