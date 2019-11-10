package com.class9;

public class PatternPractice {

	public static void main(String[] args) {
		

for (int i=0; i<4;i++) { //rows
			
			for (int j=1; j<5;j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}

System.out.println("************************");

for (int a=0; a<5; a++) {
	
	for (int b=1; b<=9; b++) {
		
System.out.print(b);
		
	}
	System.out.println();	
}
System.out.println("************************");

for (int x=0; x<5; x++ ) {
	for (int y=5;y>=1; y-- ) {
		
		System.out.print(y);
	}
	
	System.out.println();
}
System.out.println("************************");


for (int x=5; x>0; x-- ) {
	
	for (int y=5;y>=1; y-- ) {
		
		System.out.print(x);
	}
	
	System.out.println();
}

System.out.println("***************");	

//Number of rows depends on coloms 

for (int k=0; k<=5; k++ ) {
	
	for (int l=0;l<=k; l++ ) {
		
		System.out.print("*");
	}
	
	System.out.println();
}

for (int m=1; m<=9; m++ ) {
	
	for (int n=0;n<=m; n++ ) {
		
		System.out.print(m);
	}
	
	System.out.println();
}


for (int m=1; m<=9; m++ ) {
	
	for (int n=1;n<=m; n++ ) {
		
		System.out.print(n);
	}
	
	System.out.println();
}

for (int m=9; m>=1; m--) {
	
	for (int n=1;n<=m; n++ ) {
		
		System.out.print(n);
	}
	
	System.out.println();
}




	}

}
