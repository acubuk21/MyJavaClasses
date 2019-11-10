package Znotes;

import java.util.Scanner; 

public class ArraysNotes {

	public static void main(String[] args) {
		

/*		way the create arrays:
		
		int [] num=new int[4];

		int [] num= {1, 2, 4 ,3, 7};

*/		
		
			    
			    String str1="Welcome To Syntax Solutions" ;
			    
			    char[] array= new char[str1.length()]; 
			      
			     
			      
			    for (int i=0; i<str1.length(); i++){
			      array[i]=str1.charAt(i);
			      
			      System.out.println(array[i]);
			    }
			    
			  }
			}