package com.Practice.Patterns;

import java.util.Scanner;

public class TriangleTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of rows: ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		sc.close();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}

}
