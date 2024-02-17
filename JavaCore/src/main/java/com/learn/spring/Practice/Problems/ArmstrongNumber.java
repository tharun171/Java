package com.learn.spring.Practice.Problems;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static String findArmstrongOrNot(int number)
	{
		int original = number;
		int remainder = 0;
		int result = 0;
		//finding length of number
		int length = String.valueOf(number).length();
		while(number>0)
		{
			remainder = number % 10;
			result = (int)(result + (Math.pow(remainder,length)));
			number = number / 10;
		}
		System.out.println(original+" "+result);
		String res = (original==result)?"Palindrome":"Not a Palindrome";
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArmStrong Number
		//153 = length 3 = 1^3+5^3+3^3 = 1+125+27=153
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to find Armstrong or not ");
		int num = sc.nextInt();
		System.out.println(findArmstrongOrNot(num));
		sc.close();
	}

}
