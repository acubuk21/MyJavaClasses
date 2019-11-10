package com.class3;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=44;
		int b=66;
		
		//if a is bigger that b I want to print "a is larger than b"
			
			
		if (a>b) {
			
			System.out.println("a is larger than b");
		}
		
		// if the condition is true it prints, if not it skip (does not print anything)
		
		else {
			System.out.println("a is smaller than b");
		}
		
		
		double myPrice= 6.99;
		double salePrice= 4.99;
		
		
		
		if (myPrice>salePrice) {
			
			System.out.println("I will make profet");
		} else {
			System.out.println("I will NOT make profet");
			
		}
		
		double waterFreez = 32; 
		double weatherTemp= 48; 	 
		
		if (weatherTemp<=waterFreez) {
			
		 System.out.println("Water will freez at tampereture " + weatherTemp);	
		 
		} else {
			
			System.out.println("Water will NOT freez at tampereture " + weatherTemp);	
		}
		
		
		//Example
		
		//if with boolean
		
		boolean val=false;
		
		if (val) { // if (val) means val == true
			
			System.out.println("Hello");
			
		} else {
			
			System.out.println("Bye");
		}
				
		
		// Example
		boolean isRaining= false;
		
		if (isRaining) {
			
			System.out.println("I will take my unbrealla.");
		
		} else {
			
			System.out.println("I will go for a walk ");
		}
		
		
		
	}

}
