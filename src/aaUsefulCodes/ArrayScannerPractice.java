package aaUsefulCodes;

import java.util.Scanner; 

public class ArrayScannerPractice {

	public static void main(String[] args) {
//		Write a program which asks the user to enter their top five favourite foods and 
//		store their answers in a string array. However, create the array so it can only 
//		hold a maximum of three strings. After the user enters the third item, print
//		“No more memory available.”, then print out the contents of the array.

	Scanner scan=new Scanner(System.in); 
	
	String[] food=new String[3];
			
			
 	for (int i=1; i<=3; i++)	{
		System.out.println("Enter your favorite number " +i+" food" );
		food[i]=scan.nextLine();
	if (i>3) {
		System.out.println("Nooo" );	
	}
	}
		
 	for (int i=1; i<=3; i++)	{
		
 		System.out.println(food[i] );	
		
 	}
		
	}

}
