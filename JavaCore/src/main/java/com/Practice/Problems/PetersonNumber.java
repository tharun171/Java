package com.Practice.Problems;

import java.util.Scanner;

public class PetersonNumber {

	/*
	 * Peterson number
	 * if sum of factorials of each digit equal to sum of number itself
	 * 145 = 1!+4!+5! = 1+24+120 = 145
	 */
	
	public static String findPetersonOrNot(long number)
	{
		long original = number;
		long remainder = 0;
		long resultNum = 0;
		while(number>0)
		{
			remainder = number % 10;
			int factorial = 1;
			for(int i=1;i<=remainder;i++)
			{
				factorial = factorial * i;
			}
			resultNum = resultNum + factorial;
			number = number / 10;
		}
		System.out.println(original+" "+resultNum);
		return (original==resultNum)?"Peterson Number":"Not a Peterson";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to find Peterson or not: ");
		long num = sc.nextLong();
		System.out.println(findPetersonOrNot(num));
	}

}
