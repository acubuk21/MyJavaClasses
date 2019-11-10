package com.class12;

public class StrinMiniPulationDemo2 {

	public static void main(String[] args) {
		
		
		
		// METHOD: .contain()
		
		
		String state="it was raining";
		String state1="raining";
		
		
		System.out.println(state.contains("was"));
		System.out.println(state.contains("Was"));
		
		System.err.println(state.contains(state1));
		
		System.err.println(state1.contains(state));
	
	
		//METHOD: .startsWith
		
		
		String str="It is very hot in this room.";
		
		System.out.println("Does str start with it --->"+str.startsWith("It"));
		
		
		//METHOD: .endsWith
		
		System.out.println("Does str start with it --->"+str.endsWith("It"));
		
		
		//METHOD: .isEmty
		String str1="A";
		System.out.println(str1.isEmpty());
		
		if (str1.isEmpty()) {
			System.out.println("it is empty");
		} else {
			System.out.println("it is not empty");
		}
		
		//METHOD: \n
		
		System.out.println("Today is a sunny day but still \nI cannot go out.");
		
		//METHOD: .concat , work only for string. 
		
		String word1="Hello ";
		String word2="World";
		String word3="Nice";
		int num=12; 
		
		System.out.println(word1+word2);
		System.out.println("***********");
		System.out.println(word1.concat(word2));
		System.out.println(word1.concat(word2).concat(" "+word3));
		
		//METHOD:.trim
		
		String name=" David Browm";
		System.out.println("Before ---->" +name);
		System.out.println("After ---->" +name.trim());
		
		//METHOD:.charAt
		
		String statement1="we may go home early today";
		System.out.println(statement1.charAt(12));
		
		
		
		//METHOD .indexOf
		String statement2="we may go hoe early today";
		System.out.println(statement2.indexOf('m',8));
		
		
		
		//METHOD .substring
		System.out.println(statement2.substring(statement2.length()-1));
		
	}

}
