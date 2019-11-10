package com.class12;

public class StrinMiniPulationDemo {

	public static void main(String[] args) {
		

		// There are 2 ways to create String objects
		
		//Way I called: String Literal
		
		String name1="John";
		System.out.println(name1);
		int numOfLettersInName1= name1.length(); 
		System.out.println(name1.length());
		System.out.println(numOfLettersInName1);
		// Way II called: Creating String with new key word
		
		String name2=new String("David");
		System.out.println(name2);
		
		System.out.println("******************************** ");
		
		// METHODE: toLowerCase
		// METHODE: toUpperCase
		
		String hi="Hello World!";
		System.out.println("Before: " +hi);
		
		
		hi=hi.toLowerCase();
		System.out.println("Before: " +hi);
		
		hi=hi.toUpperCase();
		System.out.println("Finally: " +hi);
		
		// .equals();
		
		String hi2="HeLLo World!";
		
		boolean isEqual=hi.equals(hi2);
		System.out.println(isEqual);
		
		// .equalsIgnoreCase()
		
		boolean isEqual2=hi.equalsIgnoreCase(hi2);
		
		
		System.out.println(isEqual2);
		
		String myName="David";
		System.out.println("Before: " +myName);
		myName=myName.toUpperCase();
		System.out.println("Before: " +myName);
	}

}
