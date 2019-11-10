package com.class4;

public class NestedIf {

	public static void main(String[] args) {

		// Nested if means the is an if statement in another if statement. Condition of
		// condition.

		boolean isFriday = true;

		int day = 15;

		if (isFriday) {

			System.out.print("Troday is practice day!, ");

			if (day == 15) {

				System.out.println("and you have an appointment at 5pm!");
			}

		} else {

			System.out.println("Today is free day!");

		}

		/*
		 * Practice
		 * 
		 * Test Data Input the 1st number: 25 Input the 2nd number: 78 Input the 3rd
		 * number: 87 Expected Output : The greatest: 87
		 */

		int a = 25;
		int b = 78;
		int c = 47;
		
		
		if (a>b && a>c) {
			
		System.out.println("The greatest: " + a);
		
		}
		else if (b>a && b>c) {
			System.out.println("The greatest: " + b);
		
		}
		else {
			System.out.println("The greatest: " + c);
			
		}

	}
}