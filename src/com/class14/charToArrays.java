package com.class14;

public class charToArrays {

	public static void main(String[] args) {
		
			// toCharArray
		
		String str= "Syntex";
		
		char[] arr=str.toCharArray();
		
		
		System.out.println("Before: ");
		
		System.out.println(arr);
		
		System.out.println("Way I ");
		for (char i:arr) {
			System.out.println(i);
		}
		
		
		System.out.println("Way II ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//Split Method
		
		String b="A classical coding interview question based upon String. You need to write a method to"; 
		
		String [] array=b.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		// to find how many sentence are in a string
		
		String c="A classical coding interview. Question based upon String. You need to. write a method"; 
		
		String [] array1=c.split("\\.");
		
		int numSentence= array1.length;
		
		System.out.println("The number of sentence is :" + numSentence+ " and they are ");
		for (int i = 0; i < array1.length; i++) {
			
			
			System.out.println(array1[i].trim());
			
			// System.out.println(array1[i].trim()); //use trom to make good line
		}
		
		
	}

}
