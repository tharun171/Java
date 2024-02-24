package com.Practice.StringProblems;

import java.util.Scanner;

public class CountTotalCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter String: ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		sc.close();
		System.out.println("total characters in string");
		System.out.println("a.length() includes spaces "+a.length());

		//exclusing spaces
		int count = 0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=' ') {count++;}
		}
		System.out.println("count of charcaters without space "+count);
	}

}
