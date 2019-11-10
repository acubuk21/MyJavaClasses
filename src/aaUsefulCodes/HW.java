package aaUsefulCodes;

public class HW {

	public static void main(String[] args) {
		
		
		int sumEven=0; 
		int sumAdd=0; 
		
		for (int i=0; i<21; i++) {
			
			if (i%2==0) {
				
				sumEven=sumEven+i; 
			} else {
				sumAdd=sumAdd+i; 
			}
			
			
		}
		System.out.println("The sum of even numbers is "+ sumEven+" and the sume of add is "+ sumAdd);
		
		System.out.println("____________****************************________________");
		
		for(int row=1; row<5; row++) {
			
			for (int cal=1; cal<11; cal++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
System.out.println("____________****************************________________");
		
		for(int row=1; row<6; row++) {
			
			for (int cal=5; cal>=row; cal--) {
				
				System.out.print(row);
			}
			
			System.out.println();
			
		}
		
System.out.println("____________****************************________________");
		
		for(int row=1; row<6; row++) {
			
			for (int cal=1; cal<6; cal++) {
				
			if (row==1 || row==5) {
				
				System.out.print(row+" ");	
			
			}else {
				
				if (row==2&&cal==1){
					
					System.out.print(row+" ");	
				
				}else if (row==2&&cal==5) {
					
					System.out.print(row+" ");
				}
				System.out.print(" ");
			}
				
				//System.out.print(row+" ");
			}
			
			System.out.println();
			
		}
	}

}
