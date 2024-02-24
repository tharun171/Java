package com.Practice.StringProblems;

import java.util.Scanner;

public class Reversing_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string to reverse: ");
		String s = sc.nextLine();
		sc.close();
		
		//Using String Buffer
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		long endTime  = System.currentTimeMillis();
		System.out.println("Time in millisec: "+(endTime-startTime));
		System.out.println("Time in seconds: "+(endTime-startTime)/1000);
		System.out.println("Time in minutes: "+((endTime-startTime)/60000));
		
		//Using String Builder
		StringBuilder sb1 = new StringBuilder(s);
		System.out.println(sb1.reverse());
		
		//Using for Loop
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse += s.charAt(i);
		}
		System.out.println(reverse);
	}

}
