package aapractice;

import java.util.Scanner; 


public class Practice3 {

	public static void main(String[] args) {
		
		
		//	Given an integer, , perform the following conditional actions:
		//	If n is odd, print Weird
		//	If n is even and in the inclusive range of 2 to 5, print Not Weird
		//	If n is even and in the inclusive range of 6 to 20, print Weird
		//	If n is even and greater than 20, print Not Weird
		//	Complete the stub code provided in your editor to print whether or not n is weird.
		
		Scanner scan= new Scanner(System.in);
		
	System.out.print("Please enter your number: ");
	
	int num=scan.nextInt(); 
	
	

	if (num%2==0 && num>20) {
		
		System.out.println("Not Wierd");
		
			
		} else if ((num%2==0 && num>6)&& num<20) {
			
			System.out.println("Wierd");
			
	} else if ((num%2==0 && num>2)&& num<5) {
		
		
	
		
		System.out.println("Not Wierd");
		
	}
	  }
		
	}


