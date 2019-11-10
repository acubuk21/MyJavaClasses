package Znotes;

public class CharNotes {

	public static void main(String[] args) {
		String name="The rains have started here";
		String name1="The rains have started here";
		
		System.out.println(name.length());
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf('s'));
		
		// Way 1
		System.out.println(name.indexOf('s', 9)); // first occurrence of s
		
		// Way 2
		System.out.println(name.indexOf('s', name.indexOf('s')+1)); //first occurrence of s
		
		
		System.out.println(name.indexOf("have"));
		
		
		System.out.println(name.indexOf("hello"));// Since there is no hello, it will print -1
		
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		
		// substring
		
		System.out.println(name.substring(0, 8));
		
		//.trim()
		
		String name2=" This is me";
		
		System.out.println(name2); // without trim()
		
		System.out.println(name2.trim());// with .trim()
		
		//.replace
		System.out.println(name2.replace(" ", ""));
		
		String date="01-01-2019"; // if I would like to have 01/01/2019
		
		System.out.println(date.replace("-", "/"));
		
		//split
		
		String note="I_am_a_Java_developer";
		
		String[] noteFixed=note.split("_");
		
		for (int i=0; i<noteFixed.length; i++) {
			
			System.out.println(noteFixed[i]);
		}
		
		// .concat
		String note1="Perfect";
		
		System.out.println(note1.concat("s")); // adds the letter to the end
		
		
		String a="hello";
		String b="World";
		int x=100; 
		int y=200;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(a+b+(x+y));
		
		
		//IMPORTANT
		
		String selam1="Hello";
		String selam2="Hello";
		
		String selam3=new String("Bye");
		String selam4=new String("Bye");
		
		System.out.println(selam1.contentEquals(selam2)); //true
		System.out.println(selam1==selam2);//true
		
		
		System.out.println("**************");
		
		System.out.println(selam3.contentEquals(selam4)); //true
		System.out.println(selam3==selam4);//false
		
		System.out.println(selam1.contains("ll")); 
		
		
	}

}

