
package aapractice;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		
		int number1 = (int)(Math.random() * 20);
		int number2 = (int)(Math.random() * 20);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		
		int answer = input.nextInt();
		
		 while (number1 + number2 != answer) {
		
			 System.out.print("Wrong answer. Try again. What is "
		+ number1 + " + " + number2 + "? ");
		 
			 answer = input.nextInt();
		}
		
		 System.out.println("You got it!");
		 }
		 }
