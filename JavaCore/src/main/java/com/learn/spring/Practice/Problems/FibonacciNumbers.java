package com.learn.spring.Practice.Problems;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 1 1 2 3 5 8 13 21 34
		//first 10 fibonacci series
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of fibonacci series upto: ");
		
		final long startTime = System.currentTimeMillis();
	
		int num = sc.nextInt();
		num = num - 2;
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a+" "+b+" ");
		while(num>0)
		{
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
			num-=1;
		}
		System.out.println();
		final long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("milliseconds "+totalTime);
		System.out.println("seconds "+totalTime/1000);
		System.out.println("minutes "+totalTime/60000);
	}

}
