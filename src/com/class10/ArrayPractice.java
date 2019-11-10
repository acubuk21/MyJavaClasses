package com.class10;

public class ArrayPractice {

	public static void main(String[] args) {
		

		String[] animal= {"Cat", "Dog", "Horse", "Sheep"}; 
		
		
		for (int i=0; i<animal.length; i++) {
			
			if (animal[i].equals("Dog")) {
				
				System.out.println("I love dog");
				
			} else {
				System.out.println(animal[i]);
			}
			
			
		}
		
		System.out.println("************************");
		
		
		String[] capital= { "Amed", "Washington", "London", "Paris"};
		
			for (int i=0; i<capital.length; i++) {
			
					if (capital[i].equals("Amed")) {
						
						System.out.println("You are from KURDISTAN");
					}else {
						System.out.println(capital[i]);
					}
				
				
		}
		
		

	}

}
