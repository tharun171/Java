package com.learn.spring.JavaCore.Problems;

import java.util.Scanner;

public class Factorial {
	
	public static int findFactorial(int number)
	{
		int res = 1;
		for(int i=1;i<=number;i++)
		{
			res = res * i;
		}
		return res;
	}
	public static int findFactorialWhile(int number)
	{
		int res = 1;
		while(number>0)
		{
			res = res * number;
			number-=1;
		}
		return res;
	}
	static int result = 0;
	public static int findFactUsingRecurrsion(int number)
	{
		if(number==0) {return 1;}
		else
		{
			result = result + number*findFactUsingRecurrsion(number-1);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to find factorial: ");
		int num = sc.nextInt();
		sc.close();
		
		System.out.println(findFactorial(num));
		System.out.println(findFactorialWhile(num));
		System.out.println(findFactUsingRecurrsion(num));
	}

}
