package com.learn.spring.Practice.Patterns;

import java.util.Scanner;

public class RightTriangle_StarPattern {
	/*
	 * enter number of rows: 
6
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows: ");
		int rows = sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
