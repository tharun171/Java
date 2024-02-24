package com.Practice.StringProblems;

public class RotationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "deabc";
		//we need to check whether  string2 is rotation of string 1
		//concatenate String1 with String1
		s1 = s1 + s1;
		System.out.println("after concatenated: "+s1);
		//checking if s2 contains in s1
		//if s2 in s1, then s2 is rotated String of s1
		
		//if s1 deosnt contain s2, then returns -1
		if(s1.indexOf(s2)!=-1)
		{
			System.out.println("s2 is a rotation of first string");
		}
		else
		{
			System.out.println("s2 is not a rotation of sirst string");
		}
	}

}
