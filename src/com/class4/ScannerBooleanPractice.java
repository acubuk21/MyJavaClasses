package com.class4;

import java.util.Scanner; 

public class ScannerBooleanPractice {

	public static void main(String[] args) {
		
		System.out.println("Please enter your string: ");
		
		Scanner anyVariableName = new Scanner(System.in); 
		
		String val1= anyVariableName.next(); //Read the first word until space
		
		System.out.println("Please enter your string");
		String val2= anyVariableName.nextLine(); //Read the all word entered
		
		System.out.println("Please enter your string");
		boolean val3= anyVariableName.nextBoolean(); //Read the all word entered
		
		System.out.println("Please enter your string");
		char val4= anyVariableName.next().charAt(); 
		
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		
	}

}
