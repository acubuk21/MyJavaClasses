package reviewClass;

import java.util.Scanner; 

public class HW {

	public static void main(String[] args) {
		//Homework
		//Create a 1-D array
		//enter the sum of each row into one element of the array
		
		
		
		//Extra (work) create a 1-D array
		//enter the sum of each column into one element of the array
		int[][] matrix = new int[2][2];
		
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("Enter " + matrix.length + " rows and " +
		matrix[0].length + " columns: ");
		for (int row = 0; row < matrix.length; row++) {
		for (int column = 0; column < matrix[row].length; column++) {
		matrix[row][column] = input.nextInt();
		}
		}
		
		
	}

}
