package com.learn.spring.JavaCore.Problems;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to reverse: ");
		int a = sc.nextInt();
		int original = a;
		int remainder = 0 ;
		int reversedNum = 0;
		while(a>0)
		{
			remainder = a % 10;
			reversedNum = reversedNum * 10 + remainder;
			a = a / 10;
		}
		System.out.println(reversedNum);
	}
}
