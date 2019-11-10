package reviewClass;

public class toCharArray {

	public static void main(String[] args) {
		
		String longStr = "I am very happy today, because today is not Monday.";
		
		char[] charArray=longStr.toCharArray(); 
		
		System.out.println(charArray.length);
		
		for (int i = 0; i < charArray.length; i++) {
			
			System.out.print(charArray[i]);	
			
		}
		System.out.println();	
		
		for (int i = charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
			
		}
		
	}

}
