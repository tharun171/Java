package com.Practice.StringProblems;

import java.util.Scanner;

public class RemoveWhiteSpaces {
/*
 * enter String to remove white spaces 
this ia a statement.
Before removing spaces this ia a statement.
After Removing spaces thisiaastatement.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String to remove white spaces ");
		String s1 = sc.nextLine();
		String s2 = s1;
		s2 = s2.replaceAll("\\s+","");
		String s3 = s1.replace(" ","");
		System.out.println("Before removing spaces "+s1);
		System.out.println("After Removing spaces using regex "+s2);
		System.out.println("After Removing spaces "+s3);
	}

}
