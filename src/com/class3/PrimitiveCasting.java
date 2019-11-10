package com.class3;

public class PrimitiveCasting {
	
	public static void main (String []args) {
		
		//Casting: Changing/converting one type to another
		// Widening:  byte --> short --> int --> long --> float  --> double
		
		// Small value can be placed in lager 
		
		
		double d=10; 
		System.out.println(d);
		
		byte b=127; 
		int i= b; 
		System.out.println(i);
		
		// Narrowing: double --> float --> long --> int --> short  --> byte
		
		double num1= 123.6; 
		int num2= (int)num1; 
		
		System.out.println(num2);
		
		int num3= 1000;
		byte num4= (byte)num3; 
		System.out.println(num4);
		
	}
	
	

}
