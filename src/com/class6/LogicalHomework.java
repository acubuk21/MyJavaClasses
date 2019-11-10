package com.class6;

import java.util.Scanner; 

public class LogicalHomework {

	public static void main(String[] args) {
	
    Scanner notes=new Scanner(System.in); 


	System.out.print("quiz 1: ");
    
	int quiz1= notes.nextInt(); 	
	System.out.print("quiz 2: ");
	int quiz2= notes.nextInt();	
	System.out.print("exam 1: ");
	int exam1= notes.nextInt();	
	System.out.print("exam 2: ");
	int exam2= notes.nextInt();	
	System.out.print("finalExam 1: ");
	int finalExam= notes.nextInt();	
	
	int sum= quiz1+quiz2+exam1+exam2+finalExam;
	double ave= sum/5; 
	
	
if (ave>=90) {
	
	System.out.println("A");

}else if (ave>80 && ave<90) {
	
	System.out.println("B");
	
}else {
	System.out.println("C");
	
	
}
System.out.println(ave);	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
