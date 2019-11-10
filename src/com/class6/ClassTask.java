package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Please neter the month of your DOB: ");

		int month = scan.nextInt();

		if (month == 1 || month == 2) {
			System.out.print("Winter");

		} else if (month == 12) {
			System.out.print("Winter");
		} else if (month >= 3 && month <= 5) {

			System.out.print("Spring");

		}else if (month >= 6 && month <= 8) {
			System.out.print("Summer");
		
		}else if (month >= 9 && month <= 11) {
			System.out.print("Fall");
		}else {
			System.out.print("Unknown");
			
		}

	}

}
