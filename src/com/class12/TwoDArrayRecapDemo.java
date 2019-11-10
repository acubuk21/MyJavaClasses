package com.class12;

public class TwoDArrayRecapDemo {

	public static void main(String[] args) {
		

		int [][] array1= new int[2][3]; 
		
		
		//1st row
		array1[0][0]=9; 
		array1[0][1]=10; 
		array1[0][2]=11; 
		
		//2nd row
				array1[1][0]=19; 
				array1[1][1]=20; 
				array1[1][2]=21; 
				
				
	System.out.println("Way I: Print all veriable");			
		
		for(int i[]:array1) {
			for (int j:i) {
				System.out.println(j);
			}
			
		}
		
		System.out.println("***********************");
		System.out.println("Way II: Print all veriable");
		
		int [][] array2= {
				
				{33, 44, 55},
				{31, 41, 51}
						};
		
		for (int i2[]:array2) {
			for(int j2:i2) {
				System.out.println(j2);
			}
		}
		
	}

}
