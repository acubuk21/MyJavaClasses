package com.class14;

public class splitMethodTwo {

	public static void main(String[] args) {
	

		// How to separate comma delimited string.
		
		
		String str=" If you come to class early, then you can "
				+ "study more, and you will have coffee, leave early as well";
		
		String[] array=str.split("\\, "); 
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].trim());
		}
		
		System.out.println("************************");
		
		String str1="Welcome to the java to class";
		
		String[] array1=str1.split("to ", 3); 
		
		System.out.println(array1.length);
				
		for (int i = 0; i < array1.length; i++) {
			
			System.out.println(array1[i]);
		
		}
	}

}
