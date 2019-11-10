package aapractice;

import java.util.Scanner; 

public class Practice01 {

	public static void main(String[] args) {
		
		// Write a Java Program to find whether a String is palindrome or not?
		
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your word: ");
		String word=input.nextLine();
		
		String reverse="";
		
		
		for (int i = word.length()-1; i >=0; i--) {
			
			
			 
			reverse= reverse + word.charAt(i);
			
			
		}
		if (word.equals(reverse)) {
			
			System.out.println("The string is palindrome.");
		}else {
			
			System.out.println("The string is NOT palindrome.");
		
		
		}
		
		
	}

}
