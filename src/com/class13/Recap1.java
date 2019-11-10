package com.class13;

import java.util.Scanner; 

public class Recap1 {

	public static void main(String[] args) {
		
			Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your calss day: ");
		
		String day=input.nextLine();
		
		if (day.equalsIgnoreCase("Saturday")) {
			System.out.println("Saturday is the java class day");
			
		}else if (day.equals("Sunday")) {
			System.out.println("Sunday is the java class day");
			
		}else if (day.equals("Monday")) {
			System.out.println("There is no class on Monday");
			
		}else if (day.equals("Tuesday")) {
			System.out.println("Tuesday is the GIT class day");
			
		}else if (day.equals("Wednesday")) {
			System.out.println("Wednesday is the java review class day");
			
		}else if (day.equals("Thursday")) {
			System.out.println("Thursday is the GIT class day");
			
		}else if (day.equals("Friday")) {
			System.out.println("There is no class on Monday");
			
		}

	}

}
