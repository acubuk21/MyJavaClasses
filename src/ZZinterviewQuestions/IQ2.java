package ZZinterviewQuestions;

import java.util.Scanner; 

public class IQ2 {

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
			
System.out.println("****************");			
		

				//Q3: Write a java program to reverse String? Reverse a string word by word?
			
				
				String str3= "I am super busy today, I need extra time "; 
			
				String[] str4; 
				str4= str3.split(" ");
			
			for (int i = str4.length-1; i >=0; i--) {
				System.out.println(str4[i]);
				
			}
			
System.out.println("****************");
			
			//Q4: Write a Java Program to find whether a String is palindrome or not?
		
			System.out.print("Please enter your word: ");
			
			Scanner scan=new Scanner(System.in);
			String input=scan.nextLine();
			
			String isPalindrome="";
			
			for (int i = input.length()-1; i >=0; i--) {
				
				isPalindrome=isPalindrome+ input.charAt(i); 
				
			}
if (input.contentEquals(isPalindrome)) {
	
	System.out.println("It is a Palindrome");
}else {
	
	System.out.println("It is a not a Palindrome");
	
}

			
			}

		}
