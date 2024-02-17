package com.learn.spring.JavaCore.Problems;

import java.util.Scanner;

public class NeonNumber {

	/*
	 * Neon number
	 * 9 = 9 square = 81 = 8+1 = 9 neon
	 * 45 = 45 square = 2025 = 2+0+2+5 = 9 not neon
	 */
	public static String findNeonOrNot(int number)
	{
		int square = number*number;
		System.out.println(square);
		//convert to String
		String squareStr = String.valueOf(square);
		int sum = 0;
		for(int i=0;i<squareStr.length();i++)
		{
			sum+= Integer.parseInt(String.valueOf(squareStr.charAt(i)));
		}
		System.out.println(sum);
		if(sum==number) {return "Neon";}
		else { return "not Neon";}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("check neon number or not: ");
		int num = sc.nextInt();
		System.out.println(findNeonOrNot(num));
		sc.close();
	}

}
