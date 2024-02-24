package com.Practice.Problems;

import java.util.Scanner;

public class Palindrome {
	
	public static void checkPalindromeUsingString(int number)
	{
		int temp = number;
		//convert int to string
		String revstr = String.valueOf(temp);
		StringBuffer revstrbuf = new StringBuffer(revstr);
		StringBuffer revstrbuf1 = revstrbuf.reverse();
		int reversedNum = Integer.parseInt(revstrbuf1.toString());
		System.out.println("from method using string -> ");
		String result = (temp==reversedNum)?"palindrome":"not a palindrome";
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//palindrome = wow,12321
		System.out.println("enter a number to check palindrome or not: ");
		Scanner sc = new Scanner(System.in);
		//int a = 12321;
		int a  = sc.nextInt();
		sc.close();
		int temp = a;
		int remainder = 0;
		int reversedNum=0;
		while(a>0)
		{
			remainder = a%10;
			reversedNum = reversedNum * 10 + remainder;
			a = a/10;
		}
		System.out.println("reversed num "+reversedNum);
		String result = (temp==reversedNum)?"palindrome":"not a palindrome";
		System.out.println(result);
		
		//coz here a becomes 0 from previous execution
		checkPalindromeUsingString(temp);
	}

}
