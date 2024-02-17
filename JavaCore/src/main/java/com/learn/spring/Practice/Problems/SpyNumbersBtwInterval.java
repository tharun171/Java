package com.learn.spring.Practice.Problems;

import java.util.Scanner;

public class SpyNumbersBtwInterval {
	
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
		//System.out.println(number+" "+sumOfNums+" "+productOfNums);
		return (sumOfNums==productOfNums)?"Spy number":"Not a Spy number";
	}
	
	public static void findSpyBtwInterval(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			String res = findSpyOrNot(i);
			if(res=="Spy number")
			{System.out.print(i+" ");}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a: ");
		int a = sc.nextInt();
		System.out.println("enter b: ");
		int b = sc.nextInt();
		System.out.println("check spy number or not between "+a+" "+b);
		findSpyBtwInterval(a,b);
		sc.close();
	}

}
