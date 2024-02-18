package com.Practice.StringProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AnagramOrNot {

	/*
	 * Anagram
	 * Two Strings are called the anagram if they contain the same characters.
	 * so same length for 2 strings
	 * However, the order or sequence of the characters can be different.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String1 :");
		String string1 = sc.nextLine();
		System.out.println("enter String2 : ");
		String string2 = sc.nextLine();
		sc.close();
		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();
		if(string1.length()!=string2.length())
		{
			System.out.println("Not anagram");
		}
		else
		{
			String[] string1arr = string1.split("");
			Arrays.sort(string1arr);
			String[] string2arr = string2.split("");
			Arrays.sort(string2arr);
			System.out.println(Arrays.toString(string1arr)+" "+Arrays.toString(string2arr));
			if(Arrays.toString(string1arr).equals(Arrays.toString(string2arr)))
			{
				System.out.println("Anagrams");
			}
			else
			{
				System.out.println("Not Anagrams");
			}
			
			//OR
			if(Arrays.equals(string1arr,string2arr))
			{System.out.println("Anagram");}
			else {System.out.println("Not Anagram");}
		}
		
	}

}
