package com.class10;

import java.util.Scanner; 

public class ArreyDemo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.print("Please enter number of students took the exam: ");
		 
		int students=scan.nextInt();
		
		int[] scores =new int[students];
		
		for (int i=0; i< students; i++) {
			
			System.out.print("Please enter score: ");
			
			scores[i]=scan.nextInt();
			
			
		}
	}

}
