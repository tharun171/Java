package com.Practice.StringProblems;

//import java.util.Scanner;

public class SwapVariable_WithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		String str1 = "Good";
		String str2 = "Morning";
		System.out.println("Before Swapping");
		System.out.println("str1: "+str1+",Str2: "+str2);
		str1 = str1 + str2;
		System.out.println(str1);
		str2 = str1.substring(0,str1.length()-str2.length());
		System.out.println("After Swapping");
		System.out.println("String 2: "+str2);
		str1 = str1.substring(str2.length(),str1.length());
		System.out.println("String 1: "+str1);
	}

}
