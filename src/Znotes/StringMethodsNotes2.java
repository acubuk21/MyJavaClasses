package Znotes;

public class StringMethodsNotes2 {

	public static void main(String[] args) {
		
		
		String str1= "Today is such a nice day, I should go out";
		
		
//		16.	String substring(int beginIndex): 
//		It returns the substring of the string. 
//		The substring starts with the character at the specified index.

		System.out.print("substring  --->   ");
		System.out.println(str1.substring(8));
		
		
		
		
		
//		17.	String substring(int beginIndex, int endIndex): 
//		Returns the substring. The substring starts with character at beginIndex 
//		and ends with the character at endIndex.

		System.out.print("substring  --->   ");
		System.out.println(str1.substring(8, 12));
		
		
		
//		18.	String concat(String str): 
//		Concatenates the specified string “str” at the end of the string.

		System.out.print("concat  --->   ");
		System.out.println(str1.concat(" I can say I am lucky!"));
		
		
		
		
//		19.	String replace(char oldChar, char newChar): 
//		It returns the new updated string 
//		after changing all the occurrences of oldChar with the newChar.

		System.out.print("replace  --->   ");
		System.out.println(str1.replace("I", "you"));
		
		
		
		
		
		
//		20.	boolean contains(CharSequence s): 
//		It checks whether the string contains the specified sequence of char values. 
//		If yes then it returns true else false.  throws NullPointerException of ‘s’ is null.

		System.out.print("contains  --->   ");
		System.out.println(str1.contains("Today"));
		
		
		
		
		
//		21.	String toUpperCase(Locale locale): 
//			Converts the string to upper case string using 
//			the rules defined by specified locale.

		System.out.print("toUpperCase  --->   ");
		System.out.println(str1.toUpperCase());
		
		
		
		
		
//		22.	String toUpperCase(): 
//			Equivalent to toUpperCase(Locale.getDefault()).

		



//		23.	public String intern(): 
//			This method searches the specified string in the memory pool and 
//			if it is found then it returns the reference of it, else it allocates 
//			the memory space to the specified string and assign the reference to it.

		System.out.print("intern  --->   ");
		System.out.println(str1.intern());
		
		
		
		
//		24.	public boolean isEmpty(): 
//			This method returns true if the given string has 0 length. If the length of 
//			the specified Java String is non-zero then it returns false.

		System.out.print("isEmpty  --->   ");
		System.out.println(str1.isEmpty());
		
		
		
		
//		25.	public static String join(): 
//			This method joins the given strings using the specified delimiter and 
//			returns the concatenated Java String
//
//
//
//		26.	String replaceFirst(String regex, String replacement): 
//			It replaces the first occurrence of substring that fits the given 
//			regular expression “regex” with the specified replacement string.
//
//
//
//		27.	String replaceAll(String regex, String replacement): 
//			It replaces all the occurrences of substrings that fits the regular 
//			expression regex with the replacement string.
//
//
//
//		28.	String[] split(String regex, int limit): 
//			It splits the string and returns the array of substrings that 
//			matches the given regular expression. limit is a result threshold here.
//
//
//
//		29.	String[] split(String regex): 
//			Same as split(String regex, int limit) method however it does not have any threshold limit.
//
//
//
//		30.	String toLowerCase(Locale locale): 
//			It converts the string to lower case string using the rules defined by given locale.


//		
//		31.	public static String format(): 
//			This method returns a formatted java String
//		
//		
//		32.	String toLowerCase(): 
//			Equivalent to toLowerCase(Locale. getDefault()).
//		
//		
//		
//		33.	String trim(): 
//			Returns the substring after omitting leading and trailing 
//			white spaces from the original string.
//		
//		
//		34.	char[] toCharArray(): 
//			Converts the string to a character array.
//		
//		
//		35.	static String copyValueOf(char[] data): 
//			It returns a string that contains the characters of the specified character array.
//		
//		
//		
//		36.	static String copyValueOf(char[] data, int offset, int count): 
//			Same as above method with two extra arguments – initial offset of 
//			subarray and length of subarray.
//		
//		
//		
//		37.	void getChars(int srcBegin, int srcEnd, char[] dest, int destBegin): 
//			It copies the characters of src array to the dest array. Only the specified 
//			range is being copied(srcBegin to srcEnd) to the dest subarray(starting fromdestBegin).
//		
//		
//		38.	static String valueOf(): 
//			This method returns a string representation of passed arguments such as 
//			int, long, float, double, char and char array.
//		
//		
//		
//		39.	boolean contentEquals(StringBuffer sb): 
//			It compares the string to the specified string buffer.
//		
//		
//		
//		40.	boolean regionMatches(int srcoffset, String dest, int destoffset, int len): 
//			It compares the substring of input to the substring of specified string.
//		
//		
//		
//		41.	boolean regionMatches(boolean ignoreCase, int srcoffset, String dest, int destoffset, int len): 
//			Another variation of regionMatches method with the extra boolean argument to specify whether the
//			comparison is case sensitive or case insensitive.
//		
//		
//		
//		
//		42.	byte[] getBytes(String charsetName): 
//			It converts the String into sequence of bytes using the specified charset 
//			encoding and returns the array of resulted bytes.
//		
//		
//		
//		43.	byte[] getBytes(): 
//			This method is similar to the above method it just uses the default charset encoding 
//			for converting the string into sequence of bytes.
//		
//		
//		
//		44.	int length(): 
//			It returns the length of a String.
//		
//		
//		
//		45.	boolean matches(String regex): 
//			It checks whether the String is matching with the specified 
//			regular expression regex.
//		
//		
//		46.	int codePointAt(int index):
//			It is similar to the charAt method however it returns the 
//			Unicode code point value of specified index rather than the character itself.

		
		
		
	}

}
