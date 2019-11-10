package com.class2;

import java.util.Scanner;

public class UdemyPractice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.format("What is your name?:");
		
		String firstName = scan.nextLine();
		

		System.out.format("Your name is " +firstName);

	}

}