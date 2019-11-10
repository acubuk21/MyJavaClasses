package com.class9;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		/* PRACTICE 2
		Write a guessing game where the user has to guess a secret number 
		between 1 and 20. After every guess input, the program tells the 
		user whether their number was too large or too small. The program 
		will keep asking the user to enter the number until he finds the correct number. 
		When the correct answer is found the system should display “Congratulations!!. You got it!”  */
		
		Scanner scan= new Scanner(System.in);	
		
		System.out.println("Please guess a number to find what number I have: ");
		
		int myNum,yourNum;
		myNum=10;
		
		
		
		do {
			yourNum=scan.nextInt();
			
			if (yourNum>myNum) {
			System.out.println("Please have a small number: ");
		
		} else if (yourNum<myNum) {
			System.out.println("Please have a bigger number: ");
		
		} else {
			System.out.println("Congrat you found the number!");
		}
		
		} while (yourNum!=myNum);
		
		
		
	
	}

}
