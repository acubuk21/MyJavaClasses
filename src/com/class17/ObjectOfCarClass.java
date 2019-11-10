package com.class17;

public class ObjectOfCarClass {

	public static void main(String[] args) {
		
	//Classname name=new ClassName(); 	
		
		Car car1=new Car();

		car1.make="Tesla"; 
		car1.model="S3";
		car1.year=2020;
		car1.wheels=4;
		
		
		Car car2=new Car();
		
		car2.make="BMW"; 
		car2.model="X5";
		car2.year=2020;
		car2.wheels=4;
		car2.speed=200;
		car2.color="Black";
		
		System.out.println("I have a "+car2.make +" "+ car2.color );
		
	}

}
