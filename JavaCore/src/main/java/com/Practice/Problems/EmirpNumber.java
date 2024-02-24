package com.Practice.Problems;

import java.util.Scanner;

public class EmirpNumber {
	
	/*
	 * Emirp number
	 * is a number that is prime forwards and backwords
	 * 79 = 79 prime, on reverse 97 both are primes
	 * 13,199,107,113,1399,1583,1201,3049
	 */
	static int  bothNumberPrimes = 0;
	public static int findPrimeOrNot(int number)
	{
		int count = 0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0) {count++;}
		}
		if(count==2)
		{
			System.out.println(number+" is prime");
			bothNumberPrimes++;
			return bothNumberPrimes;
		}
		else{return 0;}
	}
	public static String findEmirpOrNot(int number)
	{
		//check if given number is prime or not
		int numberchecked = findPrimeOrNot(number);
		if(numberchecked!=0)
		{
			StringBuffer sb = new StringBuffer(String.valueOf(number));
			int reversedNum = Integer.parseInt(sb.reverse().toString());
			int bothNumberPrime = findPrimeOrNot(reversedNum);
			System.out.println("both numbers are primes "+bothNumberPrime);
			return (bothNumberPrime==2)?"Emirp":"Not Emirp";
		}
		else
		{
			return "Not Emirp";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to find Emirp or not: ");
		int num = sc.nextInt();
		System.out.println(findEmirpOrNot(num));
		sc.close();
	}

}
