package com.class9;

import java.util.Scanner; 

public class Practice1 {

	public static void main(String[] args) {
		
		
	Scanner scan= new Scanner(System.in);	
		
		
		/* PRACTICE 1:
		Write a program that reads a range of integers (start and end point), 
		provided by a user and then from that range prints the sum of the 
		even and odd integers.  */
		 
		System.out.println(" Please enter your number range: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int even=0;
		int odd=0; 
		
		
		for (int i=0; i<=num2; i++) {
			
			if (i%2==0) {
				
				even=even+i;
			} else if (i%2!=0) {
				odd=odd+i; 
			}
		}
		
		System.out.println(even);
		System.out.println(odd);
		
	}
	}
