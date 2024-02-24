package com.Java.StandardEditionTopics;

public class JavaVariables {
	//Local Variable
	/*
	 * Declared inside the method
	 * variable can be used within the method only,
	 * other methods doesnt know it exists
	 */
	public void method1()
	{
		//Local variable;
		int c = 10;
	}
	
	//Static variable
	/*
	 * create a single copy of static variable and 
	 * share it among all the instances of the class
	 * Memory allocation for static variable happen only once when  
	 */
	static int b = 20;
public static void main(String[] args)
{
	System.out.println("All Variables in Java");
	
	//Instance variable
	/*declared inside the class, but outside the body of method
	 * not declared as static 
	 * value is instance specific and not shared among instances
	 */
	int a = 10;
	System.out.println(a);	
	System.out.println(b);
	
	
	//Widening
	int c = 10;
	float d = c;
	System.out.println(c);
	System.out.println(d);
	
	//Narrowing (type casting)
	float e = 10.5f;
	//int f = e;	//Throws Type mismatch
	int f = (int)e;
	System.out.println(e);
	System.out.println(f);
	
	//Overflow
	int g = 130;
	byte h = (byte)g;
	System.out.println(g);
	System.out.println(h);
	
	
	
}
}
