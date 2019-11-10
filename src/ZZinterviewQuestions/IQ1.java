package ZZinterviewQuestions;

public class IQ1 {

	public static void main(String[] args) {
		
    int [] myNums= { 10, 212, 44, 35, 315, 404, 12, 9};
    
   int max=myNums[0]; 
   int secondMax=myNums[0];
   
	
   
   for (int i = 0; i < myNums.length; i++) {
		if (myNums[i]>max) {
			max=myNums[i]; 
		}
	}	
	
   
   
   int min=max; 
   for (int i = 0; i < myNums.length; i++) {
	if (myNums[i]<min) {
		min=myNums[i];
	}
}
  
   for (int i = 0; i < myNums.length; i++) {
	   
	   if (myNums[i]>secondMax&&myNums[i]!=max) {
		   
		   secondMax=myNums[i]; 
		   
	   }
   }

   System.out.println("The max number is :"+max);
   
   
   System.out.println("The second max number is :"+secondMax);
   
   
   System.out.println("The minx number is :"+min);
   
	}

}
