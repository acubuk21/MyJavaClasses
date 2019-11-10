package reviewClass;

public class TwoDArray1 {

	public static void main(String[] args) {
		

		int [][] b= {
				{12, 13, 23, 4},
				{2, 18, 3, 444, 16, 37},
				{124, 133, 123,},
				};
		
		//let's print number greater than 100
		
		for (int row = 0; row < b.length; row++) {
			
		
			
			for (int col=0; col<b[row].length; col++) {
				
				if (b[row][col]>=100) {
				
				System.out.print(b[row][col]+" ");
				}else {
					
				}
			}
			System.out.println();
		}
		
		
		
	}

}
