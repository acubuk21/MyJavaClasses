package reviewClass;

public class Max2DArray {

	public static void main(String[] args) {
		int [][] b= {
				{12, 13, 23, 4},
				{2, 18, 3, 444, 16, 37},
				{124, 133, 123,},
				};
		
		//let's print number greater number
		
		int max=0;
		 
		for (int row = 0; row < b.length; row++) {
			
			
			for (int col=0; col<b[row].length; col++) {
				
				if (b[row][col]>max) {
					
					max=b[row][col];
					
				}
			
			}
			
		}
		
		int min=max;
for (int row = 0; row < b.length; row++) {
			
			
			for (int col=0; col<b[row].length; col++) {
				
				if (b[row][col]<min) {
					
					min=b[row][col];
					
				}
			
			}
			
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
