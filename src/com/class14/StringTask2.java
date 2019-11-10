package com.class14;

import java.util.Scanner;

public class StringTask2 {

	public static void main(String[] args) {
		

		//Task 1: Create a String that will hold a sentence.
        // Write a program to get a new String without any spaces.
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter your sentence: ");
		
		String mySentence=input.nextLine();
		
		String[] array= mySentence.split(); 

	}

}
