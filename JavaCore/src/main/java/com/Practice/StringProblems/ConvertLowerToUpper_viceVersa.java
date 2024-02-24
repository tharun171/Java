package com.Practice.StringProblems;

import java.util.Scanner;

public class ConvertLowerToUpper_viceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String to convert lower to upper and viceversa");
		String s1 = sc.nextLine();
		StringBuffer sb1 = new StringBuffer(s1);
		for(int i=0;i<sb1.length();i++)
		{
			if(Character.isLowerCase(sb1.charAt(i)))
			{
				//if lowercase convert to uppercase
				sb1.setCharAt(i,Character.toUpperCase(sb1.charAt(i)));
			}
			else if(Character.isUpperCase(sb1.charAt(i)))
			{
				//if upper convert to lower
				sb1.setCharAt(i,Character.toLowerCase(sb1.charAt(i)));
			}
		}
		System.out.println("modified String: "+sb1);
	}

}
