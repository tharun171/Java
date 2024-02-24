package com.Practice.StringProblems;

import java.util.Scanner;

public class DivideStringIn_NequalParts {
/*
 * enter String: 
abcdefghijklmnop
enter no. of parts to divide: 
4
4.0
can be divided into 4 equal parts
abcd
efgh
ijkl
mnop
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String: ");
		String s1 = sc.nextLine();
		System.out.println("enter no. of parts to divide: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println((double)s1.length()/num);
		if(((double)s1.length()/num)-Math.floor(s1.length()/num)==0)
		{
			System.out.println("can be divided into "+num+" equal parts");
			int cut = s1.length()/num;
			for(int i=0;i<s1.length();i=i+s1.length()/num)
			{
				System.out.println(s1.substring(i,cut));
				cut=cut+s1.length()/num;
			}
		}
		else
		{
			System.out.println("cant be divided");
		}
		
	}

}
