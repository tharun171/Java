package com.Java.StandardEditionTopics;

public class JavaPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//used for building blocks of data manipulation
		
		Boolean a = true;
		Byte b = 101;	//-128 to 127, default value 0
		short c = 32767; //-32768 to 32767
		int d = 123456789; //2147483648 to 2147483647
		long e = 1234567891234567891l; //2 power 63 to (-2 power 63)-1 
		float f = 12345.678f;	//recommended, default value 0.0f, so dont use it for currencies
		double g = 12.24; //0.0d
		char h = 'a';
		
		System.out.println(a);	
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}

}
