package com.class8;

import java.util.Scanner; 

public class whileLoopPractice1 {

	public static void main(String[] args) {
		
		Scanner scan; 
		boolean isRain; 
		
		scan=new Scanner(System.in);
		
	do {
		
		System.out.println("Is it raining?");
		isRain=scan.hasNextBoolean();
		System.out.println("unbrella?");
		
	} while(!isRain); 
	
	System.out.println("park?");

	}

}
