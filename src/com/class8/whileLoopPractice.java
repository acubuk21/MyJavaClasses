package com.class8;

import java.util.Scanner; 

public class whileLoopPractice {

	public static void main(String[] args) {
	
		/* You need to ask user to pay for coffee
		* You need to keep asking user to pay for it until
		* entered price is equal =5; 
		* After user paid then say “Enjoy your coffee!”
		*/
		
		
		
		
		int price;
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter your price: ");
			price=scan.nextInt();
			
			
			
			while (price!=5) {
				
				System.out.println("Please enter your price: ");
				price=scan.nextInt();
			}
	
	System.out.println("Enjoy");
	}

}
