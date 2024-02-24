package com.Practice.Problems;

import java.util.Scanner;

public class ArmstrongBtwIntervals {
	
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
		//System.out.println(original+" "+result);
		String res = (original==result)?"Palindrome":"Not a Palindrome";
		return res;
	}
	
	public static void findArmstrongBtwIntervals(int start,int stop)
	{
		for(int i=start;i<=stop;i++)
		{
			int res = (findArmstrongOrNot(i)=="Palindrome")?i:0;
			if(res!=0) {System.out.println("Palindrome "+res);}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("finding arsmtrong number between intervals");
		System.out.println("enter first number: ");
		int a = sc.nextInt();
		System.out.println("enter second number: ");
		int b = sc.nextInt();
		System.out.println("Palidrome numbers between "+a+" "+b);
		findArmstrongBtwIntervals(a,b);
	}

}
