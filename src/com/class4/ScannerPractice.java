package com.class4;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// nextInt for numbers
		// nextLine for String
		// nextDouble for double

		System.out.println("What is your name?");

		String myName = scan.nextLine();

		System.out.println("Welcome to DMV " + myName);

		System.out.println("What is your age?");

		int age = scan.nextInt();

		if (age >= 18) {

			System.out.println("Your age meet requirements to drive.");

		} else {

			System.out.println("You are too young to drive.");
		}

		System.out.println("How many point do you have?");

		int myPoint = scan.nextInt();

		if (myPoint >= 6) {

			System.out.println("Very nice let me get your paper?");
		} else {
			System.out.println(
					myPoint + " is not enough to apply for driver license, you need to have at least 6 points?");
		}

		
		
		
		
	}

}
