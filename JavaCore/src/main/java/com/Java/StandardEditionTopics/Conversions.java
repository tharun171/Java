package com.Java.StandardEditionTopics;

import java.sql.Timestamp;
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
		System.out.println(sdf.format(l));
		String k1 = "20-feb-2023";
		SimpleDateFormat sdff = new SimpleDateFormat("dd-MMMM-yyyy");
		Date l1 = sdff.parse(k1);
		System.out.println(sdff.format(l1));	//20-February-2023
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
		SimpleDateFormat sdf5 = new SimpleDateFormat("MMM dd yy");
		String strDate5 = sdf5.format(m);
		System.out.println("dd-MM-yy "+strDate5);
		
		
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
		
		// int -> long
		int t = 236;
		long u = t;
		Long v = new Long(t);
		Long w = Long.valueOf(t);
		System.out.println(u+" "+v+" "+w);
		
		//Long -> int
		long x = 999;
		int y = (int)x;
		Long z = new Long(100);
		int aa = z.intValue();
		System.out.println(y);
		System.out.println(aa);
		
		// int -> Double
		int ab = 333;
		double ac = ab;
		System.out.println(ac);
		Double ad = new Double(ab);
		Double ae = Double.valueOf(ab);
		System.out.println(ad+" "+ae);
		
		// Double -> int
		double af = 253.21;
		int ag = (int)af;
		Double ah = new Double(333.33);
		int ai = ah.intValue();
		System.out.println(ag);
		System.out.println(ai);
		
		//Char -> int gets ascii value
		char aj = 'a';
		int ak = aj;
		System.out.println(ak);
		char al = '1';
		int am = al;
		System.out.println(am);
		//get numerical value
		int an = Character.getNumericValue(al);
		System.out.println(an);			//gets number instead of ascii
		//get String value
		int ao = Integer.parseInt(String.valueOf(al));
		System.out.println(ao);
			
		// int -> char
		int ap = 65;
		char aq = (char)ap;
		System.out.println(aq);
	
		//String -> Boolean
		String ar = "true";
		String as = "True";
		String at = "random string";
		boolean au = Boolean.parseBoolean(ar);
		boolean av = Boolean.parseBoolean(as);
		boolean aw = Boolean.parseBoolean(at);
		boolean ax = Boolean.valueOf(ar);
		boolean ay = Boolean.valueOf(as);
		boolean az = Boolean.valueOf(at);
		System.out.println(ax+" "+ay+" "+az);
		System.out.println(au);
		System.out.println(av);
		System.out.println(aw);		//random string so false
		
		// Boolean -> String 
		boolean aaa = true;
		boolean aab = false;
		String aac = String.valueOf(aaa);
		String aad = Boolean.toString(aab);
		System.out.println(aac);
		System.out.println(aad);
		
		// date to timeStamp
		Date aae = new Date();
		Timestamp aaf = new Timestamp(aae.getTime());
		System.out.println(aaf);
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
		System.out.println(sdf6.format(aaf));
		
		//timestamp -> Date
		Timestamp aag = new Timestamp(System.currentTimeMillis());
		Date date = aag;
		System.out.println(date);
		//only time
		SimpleDateFormat sdf7 = new SimpleDateFormat("dd-MM-yyyy");
		String date1 = sdf7.format(aag);
		System.out.println(date1);
	}
}
