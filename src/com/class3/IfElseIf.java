package com.class3;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 44;
		double num2 = 43.0;
		int num3 = 66;

		if (num1 > num2) {

			System.out.println(num1 + " is bigger than " + num2);
		} else if (num1 == num2) {

			System.out.println(num2 + " is equal to " + num1);

		} else {

			System.out.println(num2 + " is smaller than  " + num1);
		}

		int day = 3;

		if (day == 1) {

			System.out.println("Today is Monday");

		} else if (day == 2) {

			System.out.println("Today is Tuesday");

		} else if (day == 3) {

			System.out.println("Today is Wednesday");
		} else if (day == 4) {

			System.out.println("Today is Thursday");
		}

		// Example Month

		int month = 1;

		if (month == 1) {

			System.out.println("Your are in January");
		} else if (month == 2) {
			System.out.println("Your are in Fabruary");

		} else if (month == 3) {
			System.out.println("Your are in March");

		} else if (month == 4) {
			System.out.println("Your are in April");

		} else if (month == 5) {
			System.out.println("Your are in May");

		} else if (month == 6) {
			System.out.println("Your are in June");

		} else if (month == 7) {
			System.out.println("Your are in July");

		} else if (month == 8) {
			System.out.println("Your are in August");

		} else if (month == 9) {
			System.out.println("Your are in Septembet");

		} else if (month == 10) {
			System.out.println("Your are in October");

		} else if (month == 11) {
			System.out.println("Your are in November");

		} else if (month == 12) {
			System.out.println("Your are in December");

		}

		
		// Even or Odd 
		int number = 29;

		if (number % 2 == 0) {
			System.out.println(number + " is even");

		} else {

			System.out.println(number + " is odd");
		}

	}

}
