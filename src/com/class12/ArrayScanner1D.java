package com.class12;

import java.util.Scanner; 

public class ArrayScanner1D {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		int[] nums=new int[3]; 
		//int input=scan.nextInt();
		
		for (int i=0; i<nums.length; i++) {
			nums[i]=scan.nextInt();
			
			
		}
		 for (int j=0; j< nums.length; j++) {
			 if (nums[j]%2==0) {
			 
				 System.out.println(nums[j]);
			 }
		 }

	}

}
