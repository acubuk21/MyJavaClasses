package aapractice;

import java.util.Scanner; 

public class Practice12 {

	public static void main(String[] args) {
	
		int count=0; 
		
		Scanner input=new Scanner(System.in);

		System.out.print("Please enter your number: ");
		int myNum=input.nextInt();
		
		
		
		
		if (myNum==2) {
			System.out.println("The number is prime.");	
				
		} else  if (myNum%2==0){
			
			System.out.println("The number is NOT prime");
			
			
		} else {
			
			for (int i = 3; i < myNum; i++) {
				
				
				if (myNum%i==0) {
					count ++; 
				}
				
				
			}
		}
		
		if (count>0) {
			
			System.out.println("The number is NOT prime");
		}else {
			System.out.println("The number is prime");
		}
		
		
		}
		
	}


