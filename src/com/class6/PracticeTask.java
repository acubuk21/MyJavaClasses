package com.class6;

import java.util.Scanner; 


public class PracticeTask {

	public static void main(String[] args) {
	
	
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Do you have a green unbrela Yes/No: ");
	
	String item=scan.nextLine(); 
	
	if (item.contentEquals("Yes")) {
		
		System.out.println("How much the price of it?");
		
		double price=scan.nextDouble(); 
		
		double finalPrice; 
		
		if (price>=20.0) {
			
		finalPrice= price - price*0.1; 
		
		} else if (price>20.0 &&price<= 100.0 ) {
			
		finalPrice= price - price*0.2;
		
		}else if (price>100.0 &&price<= 500.0 ) {
			
			finalPrice= price - price*0.3;
		} else {
				finalPrice= price - price*0.5;
		
		}
		
		System.out.println("After discount " + " the price of the item reduce from " + price + " to " + finalPrice );
		
	}else {
		System.out.println("I will check another store. Bye");
	}
	
	
		
		
	}

}
