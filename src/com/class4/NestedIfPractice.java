package com.class4;

public class NestedIfPractice {

	public static void main(String[] args) {

		// You are too young to drive

		int age = 17;

		if (age <= 16) {

			System.out.println("You are too young to drive.");

		} else {
			System.out.println("You are eligible to drive, we will check for you.");

			if (age >= 18) {

				System.out.println("You can drive alone.");

			} else {
				System.out.println("Your parents need to be with you.");
			}
		}
		System.out.println("******************");

		// Practice II

		boolean isTaken = true;
		int score = 78;

		if (isTaken) {
			System.out.print(" Thank you for taken the exam on time!");
			if (score >= 80) {

				System.out.println(" Your score high enough,no need to re-take it!");
			} else {

				System.out.println("You may want to re-take the exam");
			}

		} else {
			System.out.println("Please take it ASAP!");

		}

		System.out.println("******************");

		// Practice III

		boolean hasDiploma = true;
		double gpa = 3.4;

		if (hasDiploma) {
			System.out.print(" Congratulation!");
			if (gpa >= 3.5) {

				System.out.println(" and you are eligible for scholarship!");
			} else {

				System.out.println(", unfortunately are NOT eligible for scholarship!");
			}

		} else {
			System.out.println("Please get your degree!");

		}

		System.out.println("******************");

		// Practice IV

		double rate = 4.1;
		int price = 350000;

		if (rate < 4.5) {

			System.out.print("The rate is OK for me, I  consider buying it and ");

			if (price <= 200000) {

				System.out.println("I can pay in cash");
			} else {
				System.out.println("I will take loan");
			}

		} else {

			System.out.println("The rate is too high for me, I am not buying it");
		}

	}

}
