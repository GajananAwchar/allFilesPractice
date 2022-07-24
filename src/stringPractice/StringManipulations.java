package stringPractice;

public class StringManipulations {
public static void main(String[] args) {
	
	String str= "The rainS have Started here Selenium";
	
	// total length of string
	System.out.println(str.length());
	// char at specified index in string 
	char a=str.charAt(2);
	System.out.println(a);
	
	// return index of char from string
	System.out.println(str.indexOf('h'));  // give first occurance of char 'h'
	// start index of string
	System.out.println(str.indexOf("rains"));
	// add to string in each other 
	System.out.println(str.concat(" Thank You"));
	// compare two strings and return boolean value
	System.out.println(str.equals("dsdfdsf"));
	System.out.println(str.indexOf('S', str.indexOf(('S')+1, str.indexOf('S')+1)));
	
	
}
}
