package com.class12;

public class CW {

	public static void main(String[] args) {
		
		// TASK: Create two strings and initilize them with some values and implement the following;
				//		
				//		
				//		
				//		
				//		
				//	
				//	
				
				String day="Saturday and Sunday are the Java classes";
				String time= "Java classes starts at 10am and finishes at 3pm";
				
				int dayLen=day.length();
				int timeLen=time.length();
				
				System.out.println(dayLen);
				System.out.println(timeLen);
				
				System.out.println("*************");
				
			boolean	isEqual= day.equals(time);
			System.out.println(isEqual);
			System.out.println(day.toUpperCase());
			System.out.println(day.toLowerCase());
			
			System.out.println("*************");
			
			boolean isContain1=day.contains("and");
			System.out.println(isContain1);
			
			boolean isContain2=day.contains("Java classes");
			System.out.println(isContain2);
	}

}
