package com.class10;

public class ArrayPractice1 {
	
	
	public static void main (String[]args) {
	
		/*Create an array of countries. 
		 * While retrieving all values from an array 
		 * print capital for each country.*/
		
		
		String[] capital= { "Amed", "Washington", "London", "Paris"};
		
		for (int i=0; i<capital.length; i++) {
		
			switch (capital[i]) {
			
			case "Amed":
				System.out.println("You are from Kurdistan.");
			break; 
			case "Washington":
				System.out.println("You are from USA.");
			break;
			case "London":
				System.out.println("You are from UK.");
			break;
			case "Paris":
				System.out.println("You are from France.");
			break;
			
			
			}
		
		}
		
	
		
	}
}
