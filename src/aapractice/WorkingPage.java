package aapractice;

import java.util.Scanner; 

public class WorkingPage {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Please enter your number: ");
		
		int num=scan.nextInt();
		

		
		int sum=0;
		
		for (int a=0; a<=num; a++) {
		
			sum=sum+a; 
		}
		System.out.println(sum);
	
		System.out.println("***************");	
	
		for (int b=0; b<=num; b++) {
			
			System.out.print(b + " ");
		}
		
		
	}

}
