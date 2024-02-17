package com.learn.spring.Practice.Problems;

import java.util.Scanner;

public class AutomorphicNumber {

	/*
	 * Automorphic number = square of given number ends with the same number itself
	 * 25 = 625 last2 chars
	 * 76 = 5776 = last 2 chars
	 */
	public static String findAutomorphicOrNot(long number)
	{
		String res;
		int numberlen = String.valueOf(number).length();
		//Doubling the number
		long square = number*number;
		System.out.println("square of "+number+" is "+square);
		int convertedSquarelen = String.valueOf(square).length();
		String convertedSquare = String.valueOf(square).substring((int)convertedSquarelen-numberlen,(int)convertedSquarelen);
		System.out.println("last "+numberlen+" chars "+convertedSquare);
		return (number==Long.parseLong(convertedSquare))?"Automorphic":"Not Automorphic";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to find Automorphic or not: ");
		long num = sc.nextLong();
		System.out.println(findAutomorphicOrNot(num));
	}

}
