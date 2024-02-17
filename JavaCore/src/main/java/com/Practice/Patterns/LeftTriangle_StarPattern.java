package com.Practice.Patterns;

import java.util.Scanner;

public class LeftTriangle_StarPattern {
	/*
	 * 
	 * enter no of rows: 7
            7 
          6 7 
        5 6 7 
      4 5 6 7 
    3 4 5 6 7 
  2 3 4 5 6 7 
1 2 3 4 5 6 7 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows: ");
		int rows = sc.nextInt();
		sc.close();
		for(int i=rows;i>=1;i--)
		{
			for(int j=1;j<=rows;j++)
			{
				if(j>=i) {System.out.print(j+" ");}
				else {System.out.print(" "+" ");}
			}
			System.out.println();
		}
	}

}
