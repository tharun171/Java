package com.Java.StandardEditionTopics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversions 
{
	public static void main(String[] args) throws ParseException 
	{
		// String -> Int
		String a = "1234";
		Integer b = Integer.parseInt(a);
		System.out.println(b);
		
		// Int -> String
		String c = String.valueOf(b);
		System.out.println(c);
		
		//String -> Long
		Long d = Long.parseLong(c);
		System.out.println(d);
		
		//Long -> String
		String e = String.valueOf(d);
		System.out.println(e);
		
		//String -> float
		String f = "10.2563";
		float g = Float.parseFloat(f);
		System.out.println(g);
		
		//Float ->  String
		String h = String.valueOf(g);
		System.out.println(h);
		
		//String -> Double
		double i = Double.parseDouble(h);
		System.out.println(i);
		
		//Double -> String
		String j = String.valueOf(i);
		System.out.println(j);
		
		//String -> Date
		String k = "20-01-2023";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date l = sdf.parse(k);
		System.out.println("String to Date "+l);
		
		//Date -> String
		Date m = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		String strDate = sdf1.format(m);
		System.out.println("dd-MM-yyyy "+strDate);
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
		String strDate2 = sdf2.format(m);
		System.out.println("dd-MMM-yyyy "+strDate2);
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd MMMM yyyy");
		String strDate3 = sdf3.format(m);
		System.out.println("dd MMMM yyyy "+strDate3);
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String strDate4 = sdf4.format(m);
		System.out.println("dd-MM-yyyy "+strDate4);
		SimpleDateFormat sdf5 = new SimpleDateFormat("MMM dd yyyy");
		String strDate5 = sdf5.format(m);
		System.out.println("dd-MM-yyyy "+strDate5);
		
		
		//String -> Char
		String n = "a";
		char o = n.charAt(0);
		System.out.println(o);
		
		//char -> String
		char p = 'b';
		String q = String.valueOf(p);
		System.out.println(q);
		
		//String -> Object
		String r = "hello";
		Object s = r;
		System.out.println(s);
		
		
	}
}
