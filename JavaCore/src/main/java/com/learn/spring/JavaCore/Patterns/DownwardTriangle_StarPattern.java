package com.learn.spring.JavaCore.Patterns;

import java.util.Scanner;

public class DownwardTriangle_StarPattern {
	/*
	 * enter number of rows: 
7
* * * * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows: ");
		int rows = sc.nextInt();
		for(int i=rows;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(j<=i) {System.out.print("* ");}
				else {System.out.println(" "+" ");}
			}
			System.out.println();
			}
		}
}
