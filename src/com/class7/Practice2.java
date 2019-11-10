package com.class7;

import java.util.Scanner; 

public class Practice2 {

	public static void main(String[] args) {
		
		
	Scanner scan=new Scanner(System.in);
	
	int count=1; 
	
	do{
		System.out.print("Please enter your name: ");
		
		String name=scan.next();
		
		System.out.println("Good morning "+name);
	count++; 
		
	}while (count<=5); 
	
	
	
	}

}
