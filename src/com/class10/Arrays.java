package com.class10;

public class Arrays {

	public static void main(String[] args) {
		
		int[] myNum; 
		
		myNum=new int[4];
		myNum[0]=40; 
		myNum[1]=30;
		myNum[2]=20;
		myNum[3]=10;
	
		
		System.out.println(myNum[3]);
		System.out.println();
		System.out.println(myNum[3] + myNum[0]);
		
		
		System.out.println("________________________________");
		
		String [] classes; 
		classes = new String[4];
		classes[0]= "java";
		classes[1]= "SLTC";
		classes[2]= "Manual Testing";
		classes[3]= "Git";
		
		System.out.println("Today we are having " + classes[2] + " class");
	}

}
