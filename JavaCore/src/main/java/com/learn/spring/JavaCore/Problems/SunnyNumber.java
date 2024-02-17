package com.learn.spring.JavaCore.Problems;

import java.util.Scanner;

public class SunnyNumber {

	/*
	 * Sunny number
	 * if given N, N+1 is a perfect square then, its a sunny number
	 * N = 80 , N+1=81 perfect square of 9
	 * N = 10, N+1=11 11 not a perfect square(dont get a int)
	 * so 10 is not sunny
	 */
	public static String findSunnyNumberOrNot(int number)
	{
		int nextNum = number+1;
		double sqrt = Math.sqrt(nextNum);
		System.out.println(sqrt);
		System.out.println(Math.floor(sqrt));
		System.out.println(sqrt-Math.floor(sqrt)==0);
		return (sqrt-Math.floor(sqrt)==0)?"Sunny number":"Not a Sunny number";
	
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to find Sunny number or not ");
		int num = sc.nextInt();
		System.out.println(findSunnyNumberOrNot(num));
		sc.close();
	}

}
