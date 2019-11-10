package com.class11;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		// Declare 2D arrays
		
		int [] [] array=new int[3] [4]; 
		
		//1st row
		array [0] [0]=40;
		array [0] [1]=30;
		array [0] [2]=20;
		array [0] [3]=10;
		
		//2nd row
		array [1] [0]=4;
		array [1] [1]=5;
		array [1] [2]=6;
		array [1] [3]=7;
		
		//3rd row
		array [2] [0]=12;
		array [2] [1]=13;
		array [2] [2]=14;
		array [2] [3]=15;
		
		System.out.println(array[1][2]);
	
		System.out.println(array[0][0]+array[1][1]);
		
	}

}
