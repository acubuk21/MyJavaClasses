package com.class2;

public class VariableDeclaration {
	
	public static void main (String []args) {
		
		// Name cannot have space such as num1 is correct but num 1 in not correct.
		
		// 1. declaring variable and give it a value (initilaze).
		
		int num1= 10;
		int num2= 20; 
		int num3= 30;
		
		// if you assing something new to variable the system sees the last one. Such as below
		
		num2= num1 + num3;
		
		// if you print num2 it will be  40 which is 10 + 30.
		

		
		//2. we can declare variable first and then assign value 
		
		int n1;
		int n2;
		int n3;
		
		n1 = 10;
		n2 = 20;
		n3 = 30;
		
		// 3. declare variable all together then assign values
		
		int number1, number2, number3;
		
		number1= 10;
		number2= 20;
		number3= 30; 
		
		
		char myVariable;
				
		myVariable='*' ;
		
		
		System.out.println(myVariable);
		
		
	}
	
	

}
