package aapractice;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please guess number: ");

		int myNum = 25;

		int yourNum = scan.nextInt();

		while (yourNum != myNum) {

			System.out.println("Please guess another number");

			yourNum = scan.nextInt();

			if (yourNum == myNum)
				System.out.println("your number is correct");

			if (yourNum > myNum)
				System.out.println("your number is bigger");

			if (yourNum < myNum)
				System.out.println("your number is smaller");

		}

	}

}
