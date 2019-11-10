package com.class5;

import java.util.Scanner; 

public class logicalAnd {

	
	
	public static void main(String[] args) {
	
		System.out.println("Please enter day to check your schedule: ");
	
		Scanner scan=new Scanner(System.in);
		
		String day= scan.nextLine();	
		
		
		
	if (day.equals("Saturday")|| day.equals("Sunday")) {
		
		System.out.println("You have java class");
		
	} else if (day.equals("Tuesday")|| day.equals("Thursday")) {
		
		System.out.println("You have java Testing classes");
		
		
	}else if (day.equals("Tuesdayy")) {
		System.out.println("You have review classes");
		
	} else {
		
		System.out.println("No classes");
	}
		
		
		
		
		
		
	}

}
