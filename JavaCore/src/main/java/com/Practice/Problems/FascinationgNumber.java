package com.Practice.Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FascinationgNumber {
	/*
	 * Fascinationg number
	 * multiply a number by 2 and 3 
	 * add orignal numbers and these 2 numbers
	 * convert as string if contain 1 to 9 numbers exactly once
	 *  then fascinating or else not
	 * 
	 * 327
	 */
	public static String findFascinatingOrNot(int num)
	{
		String original = String.valueOf(num);
		String multiplyBy2 = String.valueOf(num*2);
		String multiplyBy3 = String.valueOf(num*3);
		original = original + multiplyBy2 + multiplyBy3;
		//convert string to set
		String[] chars = original.split("");
		Set<String> charsSet = new HashSet<String>(Arrays.asList(chars));
		charsSet.remove("0");
		int count = charsSet.size();
		System.out.println("sum of all 3 nums concated: "+original);
		System.out.println("count of 1 to 9 chars: "+count);
		return (count==9)?"Fascinating Number":"Not a Fascinationg number";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter anumber to find fascinating or not ");
		int num = sc.nextInt();
		System.out.println(findFascinatingOrNot(num));
	}

}
