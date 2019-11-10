package com.class8;

import java.util.Scanner; 

public class Task3 {

	public static void main(String[] args) {
	
		String card; 
		Scanner scan=new Scanner(System.in);
		
		for (int q=1; q<=10; q++) {
			
			System.out.println("Would you like to apply credit card:");
			
			 card=scan.nextLine(); 
		if (card.equals("yes")){
			break; 
		}
		System.out.println("Paper");
		}
		
	}

}
