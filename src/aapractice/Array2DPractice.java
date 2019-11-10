package aapractice;

import java.util.Scanner;

public class Array2DPractice {

	public static void main(String[] args) {
		
		
 int [][] nums= {
		 
		 {12, 34, 32, 44},
		 {13, 14, 22, 54},
		 {22, 55, 38, 46},
		 {42, 94, 31, 99}
 };
		
	for (int i=0; i<4; i++)	{
		
		//System.out.println(nums[i][i]);
		
		for(int j=0; j<4; j++) {
		
			System.out.print(nums[i][j]+" ");
		}
		System.out.println();
	}
		
	System.out.println("**************");	
		
	System.out.println(nums.length);
	System.out.println(nums[1].length);
		
	}

}
