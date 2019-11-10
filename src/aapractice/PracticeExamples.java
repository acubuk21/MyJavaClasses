package aapractice;

public class PracticeExamples {

	public static void main(String[] args) {
		
		
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
			
			int row1=0; 
			int row2=0; 
			int row3=0; 
			int row4=0; 
			for (int i=0; i<a.length;i++){
				for (int j=0; j<a[i].length;j++){
				 if (i==0){
				   row1=row1+a[i][j]; 
				 } 
				if (i==1){
				   row2=row2+a[i][j]; 
				 } 
				if (i==2){
				   row3=row3+a[i][j]; 
				 } 
				  if (i==3){
				   row4=row4+a[i][j]; 
				 } 
				}
			}
		System.out.println(row1);
		System.out.println(row2);
		System.out.println(row3);
		System.out.println(row4);
		}
	}