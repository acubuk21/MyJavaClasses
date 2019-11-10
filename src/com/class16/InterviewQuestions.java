package com.class16;

public class InterviewQuestions {

	public static void main(String[] args) {
		

		// Q1: Find out how many alpha characters present in a string?
		
		
		String str="Hello, my AP Java84073067 hdb class88";
		
	   //str= str.replaceAll("[a-nA-N]"+"");

		System.out.println(str);
	
		System.out.println("****************");

		
		// Q2: How to find out the part of the string from a string? 
// What is substring? Find number of words in string?
		
		
		String today= "Today is java class day";
		today=today.substring(0, 5);
		System.out.println(today);
		
		String[] numWord=today.split(" "); 
		
		System.out.println(numWord.length);
	
	
//Q3: Write a java program to reverse String? Reverse a string word by word?
	
		System.out.println("****************");
		
		String str3= "I am super busy today, I need extra time "; 
	
		String[] str4; 
		str4= str3.split(" ");
	
	for (int i = str4.length-1; i >=0; i--) {
		System.out.println(str4[i]);
		
	}
		
	
	}

}
