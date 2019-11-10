package com.class5;

import java.util.Scanner; 


public class logicalPractice {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);

System.out.println("Please enter a number: ");
		
		int day = scan.nextInt();
		
		if (day>=1 && day<=5) {
			
			System.out.println("It is weekday");
		
		} else if (day==6 || day==7) {
			
			System.out.println("it is weekend ");
			
		} else {
			
			System.out.println("invalid day");
		}
		
	}

}
