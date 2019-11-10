package com.class13;

import java.util.Scanner; 

public class Task {

	public static void main(String[] args) {
		
			Scanner input=new Scanner(System.in);
		
			System.out.println("Please enter a day: ");
		
		 String day=input.nextLine();
		 
		 String reverse="";
		 
		 for (int i = day.length()-1; i >=0; i--) {
			 
			 reverse=reverse+day.charAt(i);
			
		}
		 
		 System.out.println(reverse);
		 
		 System.out.println("Please enter a name: "); 
		 String aDay=input.nextLine();
		 
		 
		 
		 if (aDay.length()%2!=0) {
			 
			 System.out.println(aDay.charAt((aDay.length())/2));
			 
		 } else {
			 
			 System.out.println(aDay.charAt((aDay.length())/2));
		 }
		 
		 
	}

}
