package com.learn.spring.JavaCore.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class KeithNumber {
	
	/*
	 * Keith number
	 * eg! 742
	 * 7+4+2 = 7,4,2,13
	 * add last 3 terms 4+2+13=19
	 * 2,13,19 = 34
	 * 13,19,34 = 66
	 * 19,34,66 = 119
	 * 34,66,119 = 219
	 * 66,119,219 = 404
	 * 119,219,404 = 742 
	 * stop coz 742 thus keith is exceeds 742 not keith
	 */
	//given static bcoz we need to get this variable in static method
	//local variables available inside the body
	static String res = "";
	public static String findKeithOrNot
	(int number,int lengthToUse,String[] nums)
	{
		System.out.println("fixed length: "+lengthToUse);
		System.out.println("old array: "+Arrays.toString(nums));
		int start = nums.length-lengthToUse;
		int newNum = 0;
		for(int i=start;i<nums.length;i++)
		{
			newNum += Integer.parseInt(nums[i]);
		}
		System.out.println("new number to be added: "+newNum);
		if(newNum == number)
		{
			res = "keith";
		}
		else if(newNum>number)
		{
			res = "not keith";
		}
		else
		{
		String[] nums1 = new String[nums.length+1];
		int c = 0;
		for(String var:nums)
		{
			nums1[c]=var;
			c++;
		}
		System.out.println("before adding new number: "+Arrays.toString(nums1));
		nums1[c] = String.valueOf(newNum);
		System.out.println("after adding new number: "+Arrays.toString(nums1));
		findKeithOrNot(number,lengthToUse,nums1);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter anumber to find keith or not ");
		int num = sc.nextInt();
		final int lengthToBeUsed = String.valueOf(num).length();
		String[] nums = String.valueOf(num).split("");
		System.out.println(findKeithOrNot(num,lengthToBeUsed,nums));
		sc.close();
	}
}
