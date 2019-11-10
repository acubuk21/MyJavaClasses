package com.class5;

import java.util.Scanner; 

public class LogicalExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your sale amount: ");
		
		double saleAmount=scan.nextDouble();
		
		double commision; 
		
		if (saleAmount>1 && saleAmount<100) {
			
			commision= saleAmount *0.1;
			
		}else if (saleAmount>100 && saleAmount<200) {
			
			commision= saleAmount *0.2;
		
		} else {
			
			commision= 0;
			
		}
		System.out.println(" Your commision is "+ commision);
	}

}
