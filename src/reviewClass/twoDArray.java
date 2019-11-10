package reviewClass;

public class twoDArray {

	public static void main(String[] args) {
		

		int [][] a=new int[3][4];
		
		a[0][2]=2; 
		a[1][2]=5;
		
		for (int row = 0; row < a.length; row++) {
			
			System.out.print("Row "+row+"--> ");
			
			for (int col=0; col<a[row].length; col++) {
				
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		}
		
		System.out.println("*********************");
		
		
		int [][] b= {
				{12, 13, 23, 4},
				{2, 18, 3, 444, 16, 37},
				{124, 133, 123,},
				};
			System.out.println(b.length);
			System.out.println(b[0].length);
			System.out.println(b[1].length);
			System.out.println(b[2].length);
	}

}
