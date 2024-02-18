package com.Practice.StringProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Duplicate_Characters_InString {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String to find duplicate characters in String: ");
		String n = sc.nextLine();
		sc.close();
		
		//convert String to lowercase and remove whiteSpaces
		n = n.toLowerCase();
		n = n.replace(" ","");
		
		//using arrays and set
		String[] arr = n.split("");
		Set<String> nSet = new HashSet<String>(Arrays.asList(arr));
		System.out.println(nSet.toString());
		List<String> list = new ArrayList<String>();
		for(String var:nSet)
		{
			//System.out.println(var);
			int count = 0;
			for(int i=0;i<n.length();i++)
			{
				if(var.charAt(0)==(n.charAt(i)))
				{
					count++;
				}
			}
			if(count>1)
				list.add(var);
		}
		System.out.println("duplicate characters in string: "+list.toString());
		
		//Using for Loop
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		for(int i=0;i<n.length();i++)
		{
			int count = 0;
			for(int j=0;j<n.length();j++)
			{
				if(n.charAt(i)==n.charAt(j))
				{
					count++;
				}
			}
			if(count>1)
			{
				if(list1.contains(String.valueOf(n.charAt(i)))!=true)
				{list1.add(String.valueOf(n.charAt(i)));}
			}
			else
			{
				//System.out.println(n.charAt(i));
				list2.add(String.valueOf(n.charAt(i)));
			}
		}
		System.out.println("duplicate characters in String: "+list1.toString());
		System.out.println("unique characters in String: "+list2.toString());
	}
}
