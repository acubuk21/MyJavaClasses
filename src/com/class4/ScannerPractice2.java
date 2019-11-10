package com.class4;

import java.util.Scanner;

public class ScannerPractice2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		 System.out.println("Where are you from?");
		 
		 String myCity = scan.nextLine();
		 
		 System.out.println("What is average temperature of the city?");
		  
		 int cityTemp = scan.nextInt();
		  
		 System.out.println("The temperature of the city " + myCity + " is " +
		  ((cityTemp - 32) * 5) / 9);
		 
		 *// Practice II
		 * 
		 * /* Test Data Input the number (Table to be calculated) : Input number of
		 * terms : 5 Expected Output :
		 * 
		 * 5 X 0 = 0 5 X 1 = 5 5 X 2 = 10 5 X 3 = 15 5 X 4 = 20 5 X 5 = 25
		 */

		

	}

}
