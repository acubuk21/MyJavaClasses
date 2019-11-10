package aaUsefulCodes;

import java.util.Scanner; 

public class ArrayMax {

	public static void main(String[] args) {
		
		System.out.println("Please put array size: ");
		
		Scanner scan=new Scanner(System.in);
		
		int size=scan.nextInt();
		
		int[] nums= new int[size]; 
		
		System.out.println("The size is: "+size);
		
		for (int i=0; i<size; i++) {
			
			System.out.println("Please enter a number: ");
			
			nums[i]=scan.nextInt();
		}
		
		int max=0; 
		
		for (int i=0; i<size; i++) {
		
		if (nums[i]>max) {
			
			max= nums[i]; 
		}
		
		
		}
		System.out.println("The max number is "+max);
	}

}
