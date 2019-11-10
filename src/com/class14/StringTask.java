package com.class14;

public class StringTask {

	public static void main(String[] args) {
		

//		TASK 1: Create a String that will hold a sentence. 
//		Write a program to get a new String without any spaces.
		
		System.out.print("Task 1: ");
		String str1=" Today is such a nice day to go out";
		
		System.out.println(str1.replace(" ", ""));
		
		
		
//		TASK 2: Create a String that should be combination of letters, numbers and special characters.
//		Find out how many alpha characters are there in the String.
		
		System.out.print("Task 2: ");
		
		String str2="123Sun44day$%^&!* 4";
		
		String count= str2.replaceAll("\\w", "");
		
		System.out.println(count.length());
		
		
		
//		TASK 3: You have a String a=”Is it Saturday? Is it raining? Do we have a Java Class today?” 
//		How would you find out how many sentences are in that String?
		
		System.out.print("Task 3: ");
		
		String str3="Is it Saturday? Is it raining? Do we have a Java Class today?";
		
		String[] array=str3.split("\\?");
		
		System.out.println("There are "+ array.length +" sentences.");
		
//		for (int i = 0; i < array.length; i++) {
//		
//			System.out.println(array[i].trim());	
//			
//		}
		
		
		
	}

}
