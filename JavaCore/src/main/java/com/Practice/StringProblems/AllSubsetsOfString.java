package com.Practice.StringProblems;

import java.util.Scanner;

public class AllSubsetsOfString {

	/*
	 * n = length of string
	 * All the possible subsets for a string will be n(n+1)/2.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String to find subsets: ");
		String s1 = sc.nextLine();
		sc.close();
		//String s1 = "FUN";
		int count = 0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				//System.out.println(i+" "+j+1);
				if(i<=j)
				{
				String s2 = s1.substring(i,j+1);
				System.out.println(s2);
				count++;
				}
			}
		}
		System.out.println("count of subsets "+count);
	}

}
