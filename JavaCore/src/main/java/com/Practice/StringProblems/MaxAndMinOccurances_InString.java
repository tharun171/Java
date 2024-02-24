package com.Practice.StringProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MaxAndMinOccurances_InString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "this is a statement";
		//sorting in descending order
		TreeMap<String,Integer> tm = new TreeMap<>(Comparator.reverseOrder());
		//convert string to array and then set
		s1 = s1.replace(" ","");
		String[] arr = s1.split("");
		Set<String> s = new HashSet<String>(Arrays.asList(arr));
		System.out.println(s);
		List<String> l = new ArrayList<String>(Arrays.asList(arr));
		for(String var:s)
		{
			int count = 0;
			for(int j=0;j<s1.length();j++)
			{
				if(var.charAt(0)==s1.charAt(j))
				{
					count++;
				}
			}
			tm.put(var,count);
		}
		Map<String,Integer> m = new LinkedHashMap<String,Integer>(tm);
		System.out.println(m.toString());
		/*Sorting map
		m.entrySet().
		stream().
		sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
		forEach(System.out::println);
		*/
		//Get first and last
		System.out.println("entry set: "+m.entrySet());
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println("first entry: "+m.entrySet().iterator().next());
		//last entry
		Map.Entry<String,Integer> lastEntry = null;
		for(Map.Entry<String,Integer> var:m.entrySet())
		{
			lastEntry = var;
		}
		System.out.println("last entry: "+lastEntry);
	
		
	}
}
