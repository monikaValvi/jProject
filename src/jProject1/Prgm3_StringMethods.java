package jProject1;

public class Prgm3_StringMethods {

	public static void main(String[] args) {
		// Length Concat Equals EqualIgonreCase Contains Substring Replace
		
		String s = "Welcome";
		String m = "Mona";
		
		//length
		System.out.println(s.length());
		
		//Concat
		System.out.println(s.concat(" "+ "monika"));
		System.out.println(s+ "   mona");
		System.out.println(s+ " " +m);
		
		//Equals
		String c = "WelcOme";
		System.out.println(c.equals(s));
		System.out.println(c.equalsIgnoreCase(s));
		
		//Contains
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("Wl"));
		
		//Substring
		System.out.println(s.substring(0,4));
		System.out.println(s.substring(3,7));
		
		//Replace
		System.out.println(s.replace("e", "a"));
		System.out.println(s.replace("Wel", "Bhel"));
		
	}

}
