package com.class14;

public class FibonacciSeries {

	public static void main(String[] args) {
		

		int [] fibSer= new int[10]; 
		
		fibSer[0]=0;
		fibSer[1]=1;
		
		for (int i = 2; i < fibSer.length ; i++) {
			
			fibSer[i]= fibSer[i-1]+fibSer[i-2]; 
			
			
			System.out.println(fibSer[i]);
		}
		
		
		
	}

}
