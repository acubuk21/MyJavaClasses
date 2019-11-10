package com.class8;

import java.util.Scanner; 
public class advanceLoop {

	public static void main(String[] args) {
	

/*	for(int a=0,  b=0; a+b<16;  a++,b++) {
		
		if ((a+b)%2==0) {
			
			System.out.println(a+b);
		}
		
	
	}
		
	*/	
		
	/*	for (int i = 0; i < 10; i++) {
			
			System.out.println(i);
		}	
	*/	
	
		
		
		Scanner input = new Scanner(System.in);
		
		int number, sum = 0, count;
		
		for (count = 0; count < 5; count++) {
		number = input.nextInt();
		sum += number;
		}
		
		System.out.println("sum is " + sum);
		
		System.out.println("count is " + count);
		
		
		
		
		
		
		
		
	}

}
