package com.Java.StandardEditionTopics;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char character = 'w';
		
		switch(character)
		{
		case 'a':
			System.out.println("entered a ");
			System.out.println("entered A");
			//if break is not written here
			//everything below cases other than a also be printed
			break;
		case 'b':
			System.out.println("entered b");
			System.out.println("entered B");
			break;
		default:
			System.out.println("default code when switch cant find the condition");
		}

	}

}
