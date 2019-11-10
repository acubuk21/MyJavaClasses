package aapractice;

import java.util.Scanner; 


public class SwitchPractice {

	public static void main(String[] args) {
		
		
		 
		   
		  Scanner scan= new Scanner(System.in); 
		  
		  System.out.println("Enter name of the instructor");
		  
		  String name=scan.nextLine();
		  String program;

		  
		  switch(name) {
		  case "Shiva":
		    program ="Java";
		    break; 
		   case "Sandish":
		    program ="SDLC"; 
		  break;
		  case "Weqas":
		    program ="Selenium";
		  break;
		  case "Asel":
		    program ="every";
		  break;
		  default:
		  program = " Invalid instructor selected";
		  break;
		  }
		   System.out.println("Will take care of " + program+ " Assignment");
		
		
		
		
		}	
	}


