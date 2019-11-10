package com.class2;

public class StringExamples {
	
	public static void main (String []args) {
		
		// String is a class that represent sequence of character inclosed within ""
		
	/*	
		String name= "David"; 
		String toDo= "You must study 2h everday";
		String Salary= "$160,000";
		String space= " ";
				
		System.out.println(space);	
		*/
		
		// Practice 1
		
		String name= "David"; 
		String lastName= "Brown";
		int grade= 11;
		String city= "Wayne"; 
		String state= "NJ";
		int phoneNumber= 1234567899;
		
		System.out.println(name + " " + lastName + "is in " + grade + " grade");
				
		// Practice 2: lets do this task "Today is September 22
		
		String task= "Today is";
		String month= "September";		
		int day= 22;
		
		System.out.println (task + " "+ month+" " + day);
		
		
		// Practice 3 type chasing means convert one type of number to another. Such as int to double
		
		int num1= 4; 
		double num2= num1;
		
		System.out.println(num2); 
		
		
		
		
		
	}

}
