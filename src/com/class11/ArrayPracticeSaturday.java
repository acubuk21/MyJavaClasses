package com.class11;

public class ArrayPracticeSaturday {

	public static void main(String[] args) {
		
//		1. Create an array of cars and store 6 elements into it. 
//		Using 2 different loops print all values from the array.
		
		String [] cars= {"BMW", "Toyota", "Honda", "Jeep", "Ford", "KIA"};
		
		for (String element:cars) {
			System.out.println(element);
		}
		
		
		System.out.println("_____________________");	
		
		
//		2. Create an array on integers and calculate the sum of 
//		all elements in an array.

		int [] myNum= {3, 15, 42, 33, 16, 13};


		int sum=0; 
		for (int i=0; i<myNum.length; i++) {
	
			sum=sum+myNum[i]; 
}
		
	System.out.println(sum);	
		
	System.out.println("___________________________");		
		
//		3. Create an array of countries. While retrieving all values from an array print capital 
//		for each country. (use 2 different loops).
		
		
		String[] countries= {"Kurdistan", "United State", "United Kingdom", "Canada"};
		
		
		for (String  getCapital:countries) {
			
			if (getCapital.contentEquals("Kurdistan")) {
				
				System.out.println("bbbbb");
			}
		}
		
		
		
		for (int i=0; i<countries.length; i++) {
			
			if (countries[i].equals("Kurdistan")) {
				
				System.out.println("Capital of Kurdistan is Amed");
			}
			

			
		}
		
		
		

	}

}
