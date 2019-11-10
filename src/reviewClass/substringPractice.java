package reviewClass;

public class substringPractice {

	public static void main(String[] args) {
		
		String longStr = "I am very happy today, because today is not Monday.";
        String anotherStr = longStr.substring(10);
        System.out.println(anotherStr);
                
        anotherStr = longStr.substring(10, 15);
        System.out.println(anotherStr);
        
        	//  System.out.println(longStr.substring(20, 10));
        	// longStr.substring(10, 56);
        
        //
        // replace
        
      String rep=longStr.replace("t", "g");
      System.out.println(rep); 
      
      
      String anotherRep=longStr.replace('a', 'e').replace('e', 'a');
      System.out.println(anotherRep); 
      
      String happy=longStr.replace("today","tomorrow" );
      System.out.println(happy); 
      
    }
}