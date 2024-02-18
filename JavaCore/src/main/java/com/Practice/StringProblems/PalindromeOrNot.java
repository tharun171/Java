package com.Practice.StringProblems;

import java.util.Scanner;

public class PalindromeOrNot {
	
	public static String usingStringBuffer(String s)
	{
		StringBuffer s2 = new StringBuffer(s);
		s2 = s2.reverse();
		System.out.println("using string buffer to find Palindrome or not: ");
		return (s.equals(s2.toString()))?"Palindrome ":"Not a Palindrome";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String to find Palindrome or Not");
		String s1 = sc.nextLine();
		s1 = s1.toLowerCase();
		sc.close();
		
		//Using StringBuffer
		System.out.println(usingStringBuffer(s1));
		
		Double end = (double)s1.length()/2;
		System.out.println(Math.ceil(end));
		int count = 0;
		for(int i=0;i<end;i++)
		{
			System.out.println(i+" "+String.valueOf(s1.length()-1-i));
			System.out.println(s1.charAt(i)+" comppared with last "+s1.charAt(s1.length()-1-i));
			if(s1.charAt(i)==s1.charAt(s1.length()-1-i))
			{
				count++;
			}
		}
		String res = (count==Math.ceil(end))?"Palindrome ":"Not Palindome";
		System.out.println(res);
	}

}
