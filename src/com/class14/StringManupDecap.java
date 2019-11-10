package com.class14;

public class StringManupDecap {

	public static void main(String[] args) {
		

		String str1="Hello";
		System.out.println(str1);
		
		String str2=str1.replaceAll("Hello", "Bye");
		
			System.out.println(str2);
			
			System.out.println("********************");
			
			// .replace
			String greet="Good Morning to you";
			
			System.out.println(greet.replace('G', 'D'));
			System.out.println(greet.replace("G", "D"));
		
			System.out.println(greet.replace("you", "me"));
			
			
			// .replaceAll
			
			String s= "Koeman made 264 appearances in six seasons for the Catalan club "
					+ "during his stellar playing career, and says that they are the only club "
					+ "that could persuade him to leave the Netherlands national team setup.";
			
			
			System.out.println(s.replaceAll("club(.*)", ""));
			
			
			String g="23984Hello390284*^&*@"; 
			
			System.out.println(g.replaceAll("[0-9]", ""));
			System.out.println(g.replaceAll("[^a-zA-Z^]", ""));
			System.out.println(g.replaceAll("\\W", ""));		// Important
			System.out.println(g.replaceAll("\\w", ""));		// Important

			
			String a= "Koeman made 264 appearances in six seasons for the Catalan club ";
			
			System.out.println(a.replaceFirst(" ", ""));
			
			System.out.println("********************** ");
			
			
			String v="Video provides a powerful way to help you prove your point. "
					+ "When you click Online Video, you can paste in the embed "
					+ "code for the video you want to add. ";
			
			
			System.out.println(v.toLowerCase().replace("video", "Audio"));
			
			
	}

}
