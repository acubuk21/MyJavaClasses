package com.class12;

public class FindDuplicatInArray {

	public static void main(String[] args) {
		
		int [] array1= {2, 3, 3, 2, 1, 5, 4, 3};
		
		for (int i=0; i< array1.length; i++) {
			//System.out.println(array1[i]);
			
			for (int j=i+1; j<array1.length; j++) {
				
				if (array1[i]==array1[j]) {
					System.out.println(array1[i]);
				}
			}
		}
		
		
	}

}
