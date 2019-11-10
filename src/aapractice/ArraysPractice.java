package aapractice;

import java.util.Scanner;

public class ArraysPractice {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		
		int num =0;
	     while(num<=100)
	     {
	         System.out.println("Value of variable is: "+num);
	         if (num== 45)
	         {
	            break;
	         }
	         num++;
	     }
	     System.out.println("Out of while-loop");
		
	}

}
