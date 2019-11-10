package aaUsefulCodes;

public class ArrayPractice {

	public static void main(String[] args) {
//		Create an array of five doubles and give each element some value. 
//		Calculate the sum of all the elements and print the result. 
//		Calculate the mean/average of the all the elements and print that too.
		
		
		double[] nums= {1.3, 3.8, 6.1, 5.2, 12.5, 6.6, 8.2, 9.2};
		
		double sum=0; 
		double mean=sum/8; 
		
		for (int i=0; i<8; i++) {
			
			System.out.println(nums[i]);
		}
		System.out.println("_______________*************___________");
			
		for (int j=0; j<8; j++) {
			
				sum=sum+ nums[j];
			}
		
		System.out.println("The sum of the elements are "+ sum +" and the mean is "+ sum/8);
		
		
	}

}
