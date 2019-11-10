package Znotes;

public class StringMethodsNotes1 {

	public static void main(String[] args) {
		

//			1. char charAt(int index): 
//		    It returns the character at the specified index. 
//			Specified index value should be between 0 to length() -1 both inclusive. 
//			It throws IndexOutOfBoundsException if index<0||>= length of String.

		String str1="Today was a raining and cold day. It was not smart to go out";
		
		System.out.print("charAt --->   ");
		System.out.println(str1.charAt(4));
		
		


//			2.	boolean equals(Object obj): 
//			Compares the string with the specified string 
//			and returns true if both matches else false.

		System.out.print("equals  --->   ");
		System.out.println(str1.equals("Today was a nice day"));
		
		
//			3.	boolean equalsIgnoreCase(String string): 
//			It works same as equals method 
//			but it doesn’t consider the case while comparing strings. 
//			It does a case insensitive comparison.
		
		
		System.out.print("equalsIgnoreCase  --->   ");
		System.out.println(str1.equalsIgnoreCase("today was a nice day"));


		
		
		
		
//			4.	int compareTo(String string): 
//			This method compares the two strings based on the Unicode 
//			value of each character in the strings.

		String name1="Harry";
		String name2="Hanry";
		
		
		System.out.print("compareTo  --->   ");
		System.out.println(name1.compareTo(name2));
		
		
		
		
//			5.	int compareToIgnoreCase(String string): 
//			Same as CompareTo method however 
//			it ignores the case during comparison.


		System.out.print("compareToIgnoreCase  --->   ");
		System.out.println(str1.compareToIgnoreCase("today was a nice day"));
		
		

//			6.	boolean startsWith(String prefix, int offset): 
//			It checks whether the substring (starting from the specified offset index) 
//			is having the specified prefix or not.

		System.out.print("startsWith  --->   ");
		System.out.println(str1.startsWith("d", 2));
		
		
		
		
//			7.	boolean startsWith(String prefix): It tests whether the string is having specified prefix, 
//			if yes then it returns true else false.

			System.out.print("startsWith  --->   ");
			System.out.println(str1.startsWith("T"));


			
			
			
//			8.	boolean endsWith(String suffix): Checks whether the string ends with the specified suffix.

			System.out.print("endsWith  --->   ");
			System.out.println(str1.endsWith("y"));
			
			
			
			
//			9.	int hashCode(): It returns the hash code of the string.

			
			
			
//			10.	int indexOf(int ch): Returns the index of first occurrence of the 
//			specified character ch in the string.

			System.out.print("indexOf  --->   ");
			System.out.println(str1.indexOf("y"));
			
			
			
			
//			11.	int indexOf(int ch, int fromIndex): Same as indexOf method however 
//			it starts searching in the string from the specified fromIndex.

			System.out.print("indexOf  --->   ");
			System.out.println(str1.indexOf('y', 5));
			
			
			
//			12.	int lastIndexOf(int ch): It returns the last occurrence of the 
//			character ch in the string.

			System.out.print("lastIndexOf  --->   ");
			System.out.println(str1.lastIndexOf('y'));


			
//			13.	int lastIndexOf(int ch, int fromIndex): Same as lastIndexOf(int ch) method, 
//			it starts search from fromIndex.


			System.out.print("lastIndexOf  --->   ");
			System.out.println(str1.lastIndexOf('a', 5));
			
			
			
//			14.	int indexOf(String str): This method returns the index of first 
//			occurrence of specified substring str.

			System.out.print("indexOf  --->   ");
			System.out.println(str1.indexOf("was"));
			
			
			
//			15.	int lastindexOf(String str): Returns the index of last 
//			occurrence of string str.
	
			System.out.print("lastIndexOf  --->   ");
			System.out.println(str1.lastIndexOf("was"));
		
		
		
		
		
	}

}
