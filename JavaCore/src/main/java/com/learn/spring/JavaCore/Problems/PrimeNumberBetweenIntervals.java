package com.learn.spring.JavaCore.Problems;

import java.util.Scanner;

public class PrimeNumberBetweenIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter start number: ");
		int a = sc.nextInt();
		System.out.print("enter stop number: ");
		int b = sc.nextInt();
		System.out.println("prime numbers bw those numbers");
		for(int start=a;start<=b;start++)
		{
			int c = 0;
			for(int i=1;i<=start;i++)
			{
				if(start%i==0)
				{
					c+=1;
				}
			}
			if(c==2) {System.out.print(start+" ");}
		}
	}

}
