package com.Practice.StringProblems;

import java.util.Scanner;

public class ReplaceWhiteSpacesWith_SpecialSymbol {

	/*
	 * enter String to replace white spaces with -
this is a statement
Before removing spaces this is a statement
After Removing spaces using regex this-is-a-statement
After Removing spaces this-is-a-statement
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String to replace white spaces with -");
		String s1 = sc.nextLine();
		sc.close();
		String s2 = s1;
		s2 = s2.replaceAll("\\s+", "-");
		String s3 = s1.replace(" ", "-");
		System.out.println("Before removing spaces " + s1);
		System.out.println("After Removing spaces using regex " + s2);
		System.out.println("After Removing spaces " + s3);
	}

}
