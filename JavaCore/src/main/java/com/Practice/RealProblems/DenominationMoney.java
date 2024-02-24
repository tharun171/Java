package com.Practice.RealProblems;

import java.util.Scanner;

public class DenominationMoney {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount to know the denomination: ");
		long amount = sc.nextLong();
		while(amount>0)
		{
			//System.out.println(amount);
			if(amount>=500)
			{
				long FiveHundreds = (long)Math.floor(amount/500);
				System.out.println("total five hundreds "+FiveHundreds);
				amount = amount - (FiveHundreds*500);
			}
			else if(amount>=200 && amount<500)
			{
				long TwoHundreds = (long)Math.floor(amount/200);
				System.out.println("total Two hundreds "+TwoHundreds);
				amount = amount - (TwoHundreds*200);
			}
			else if(amount>=100 && amount<200 && amount<500)
			{
				long Hundreds = (long)Math.floor(amount/100);
				System.out.println("total hundreds "+Hundreds);
				amount = amount - (Hundreds*100);
			}
			else if(amount>=50 && amount<100 && amount<200 && amount<500)
			{
				long Fifty = (long)Math.floor(amount/50);
				System.out.println("total fifty "+Fifty);
				amount = amount - (Fifty*50);
			}
			else if(amount>=20 && amount<50 && amount<100 && amount<200 && amount<500)
			{
				long twenty = (long)Math.floor(amount/20);
				System.out.println("total twenty "+twenty);
				amount = amount - (twenty*20);
			}
			else if(amount>=10 && amount<20 && amount<50 && amount<100 && amount<200 && amount<500)
			{
				long tens = (long)Math.floor(amount/10);
				System.out.println("total tens "+tens);
				amount = amount - (tens*10);
			}
			else if(amount>=5 && amount<10 && amount<20 && amount<50 && amount<100 && amount<200 && amount<500)
			{
				long Fives = (long)Math.floor(amount/5);
				System.out.println("total fives "+Fives);
				amount = amount - (Fives*5);
			}
			else if(amount>=2 && amount<5 && amount<10 && amount<20 && amount<50 && amount<100 && amount<200 && amount<500)
			{
				long two = (long)Math.floor(amount/2);
				System.out.println("total two coins "+two);
				amount = amount - (two*2);
			}
			else if(amount>=1 && amount<2 && amount<5 && amount<10 && amount<20 && amount<50 && amount<100 && amount<200 && amount<500)
			{
				long ones = (long)Math.floor(amount/1);
				System.out.println("total one coins "+ones);
				amount = amount - (ones*1);
			}
		}
		sc.close();
	}

}
