package com.learn.spring.Practice.Problems;

import java.util.Scanner;

public class SpyNumber {
	/*
	 * Spy number 
	 * sum and product of its digits are equal
	 * 1124,132,123
	 * 1+1+2+4 =8
	 * 1*1*2*4 = 8
	 */
	public static String findSpyOrNot(int number)
	{
		String[] nums = String.valueOf(number).split("");
		int sumOfNums = 0;
		int productOfNums = 1;
		for(int i=0;i<nums.length;i++)
		{
			sumOfNums+= Integer.parseInt(nums[i]);
			productOfNums *= Integer.parseInt(nums[i]);;
		}
		System.out.println(number+" "+sumOfNums+" "+productOfNums);
		return (sumOfNums==productOfNums)?"Spy number":"Not a Spy number";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("check spy number or not: ");
		int num = sc.nextInt();
		System.out.println(findSpyOrNot(num));
		sc.close();
	}
}
