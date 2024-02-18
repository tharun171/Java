package com.Practice.Patterns;

import java.util.Scanner;

public class RandomPattern {
	
	/*
	 * enter number to rows to print: 
7
7 6 5 4 3 2 * 
7 6 5 4 3 * 1 
7 6 5 4 * 2 1 
7 6 5 * 3 2 1 
7 6 * 4 3 2 1 
7 * 5 4 3 2 1 
* 6 5 4 3 2 1 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number to rows to print: ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		sc.close();
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows;j>=1;j--)
			{
				if(j==i) {System.out.print("* ");}
				else {System.out.print(j+" ");}
			}
			System.out.println();
		}
	}

}
