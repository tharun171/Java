package com.learn.spring.Practice.Problems;

import java.util.Scanner;

public class TechNumber {

	/*
	 * Tech Number
	 * 2025 = 20+25 = 45
	 */
	public static String findTechNumberOrNot(long number)
	{
		String numConverted = String.valueOf(number);
		if(numConverted.length()%2!=0 && number!=1)
		{
			System.out.println("not an even number");
			return "Not a Tech number";
		}
		else
		{
			if(number==1) {return "Tech number";}
			String firstNum = numConverted.substring(0,numConverted.length()/2);
			String secondNum = numConverted.substring(numConverted.length()/2,numConverted.length());
			double sumOfNumsSquare = Math.pow(Integer.parseInt(firstNum)+Integer.parseInt(secondNum),numConverted.length()/2);
			System.out.println("sum of sqares "+sumOfNumsSquare);
			return (number==sumOfNumsSquare)?"Tech number":"Not a Tech Number";
		}
	}
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number to find Tech number or not: ");
	long num = sc.nextLong();
	System.out.println(findTechNumberOrNot(num));
	sc.close();
	}
}
