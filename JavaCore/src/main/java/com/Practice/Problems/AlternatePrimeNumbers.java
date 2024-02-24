package com.Practice.Problems;

import java.util.Scanner;

public class AlternatePrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter alternate prime numbers upto :");
		int num = sc.nextInt();
		int count = 0;
		for(int i=1;i<=num;i++)
		{
			int countOfFactors = 0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					countOfFactors+=1;
				}
			}
			if(countOfFactors==2)
			{
				count+=1;
				if(count%2!=0)
				{
					System.out.print(i+" ");
				}
			}
		}
	}

}
