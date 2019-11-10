package com.class6;

import java.util.Scanner; 


public class MyPractice {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in); 
		
		System.out.print("Please enter your month of DOB: ");
		
		int month= scan.nextInt(); 
		
		String season; 
		
		if (month == 1 || month == 2) {
			season= "Winter";

		} else if (month == 12) {
			season="Winter";
			
		} else if (month >= 3 && month <= 5) {

			season="Spring";

		}else if (month >= 6 && month <= 8) {
			season= "Summer";
		
		}else if (month >= 9 && month <= 11) {
			season= "Fall";
		
		}else {
			season="Unknown";
			
		}
		
		System.out.println("You were born in " +season);
		
		

	}

}
