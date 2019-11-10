package reviewClass;

import java.util.Scanner; 

public class twoDArrayScanner {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in); 
		
		System.out.println("Please provide rows and colomns: ");
		int row=scan.nextInt();
		int col=scan.nextInt();
		
		String [][] name= new String[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j=0; j<col; j++) {
			
				name[i][j]=scan.nextLine();
			
				
				
			}
		}
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
			
				System.out.print(name[i][j]+ " ");		
			}
			System.out.println();	
		}
		
	}

}
