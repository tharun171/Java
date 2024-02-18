package com.Practice.StringProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TotalPunctuationInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String: ");
		String a = sc.nextLine();
		sc.close();
		int punctuationCount = 0;
		Character[] list = {'!',',',';','.','?','-',':','/','"'};
		List<Character> list1 = new ArrayList<Character>();
		list1.addAll(Arrays.asList(list));
		for(int i=0;i<a.length();i++)
		{
			if(list1.contains(a.charAt(i)))
			{punctuationCount++;}
		}
		System.out.println("punctuation count "+punctuationCount);
	}
}
