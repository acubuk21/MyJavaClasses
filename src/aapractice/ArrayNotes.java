package aapractice;


import java.util.Scanner;

public class ArrayNotes {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		
		double[] myList = new double[4];
		
		
		System.out.print("Enter " + myList.length + " values: ");
		
		for (int i = 0; i < myList.length; i++) {
		
			myList[i] = scan.nextDouble();
			
			System.out.println(myList[2]);
		
		}
		
		
		
		
		
	}

}
