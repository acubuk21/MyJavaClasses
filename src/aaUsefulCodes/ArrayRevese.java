package aaUsefulCodes;

public class ArrayRevese {

	public static void main(String[] args) {
		

		String [] animal= {"Cat", "Dog", "Horse", "Rabbit"};
		
		System.out.println("_______Normal_________");
		
		for (int i=0; i<animal.length; i++) {
			
		
			System.out.println(animal[i]);
		}
		System.out.println("_______inverse_________");
		
		for (int j=animal.length-1; j>=0; j-- ) {
			
			System.out.println(animal[j]);
		}
		
	
		
	}

}
