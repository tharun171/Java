package com.Practice.StringProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VowelAndConsonantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String: ");
		String a = sc.nextLine();
		sc.close();
		int vowelCount = 0;
		int consonantCount = 0;
		Character[] list = {'a','e','i','o','u','A','E','I','O','U'};
		List<Character> list1 = new ArrayList<Character>();
		list1.addAll(Arrays.asList(list));
		for(int i=0;i<a.length();i++)
		{
			int asciivalue = a.charAt(i);
			if((asciivalue>=97 && asciivalue<=122) ||
					(asciivalue>=65 && asciivalue<=90))
			{
				if(list1.contains(a.charAt(i)))
				{vowelCount++;}
				else {consonantCount++;}
			}
		}
		System.out.println("vowel count "+vowelCount);
		System.out.println("consonant count "+consonantCount);
	}

}
