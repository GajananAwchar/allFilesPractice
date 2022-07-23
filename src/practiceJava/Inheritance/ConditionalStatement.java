package practiceJava.Inheritance;
public class ConditionalStatement {
	public static String reverseString (String st) {
		String a [] = st.split(" ");
		String reverseWord="";
	for(String word:a) {
		StringBuffer sb= new StringBuffer(word);	
		sb.reverse();
		reverseWord= reverseWord+ sb.toString() + " ";
	}
	System.out.println(reverseWord); 
	return reverseWord;
	  }
	public static String rreverseString (String str) {
int len= 	str.length();	
		String reverseWord="";
	for(int i=len-1; i>=0; i--) {
		reverseWord = reverseWord + str.charAt(i);
	}
	System.out.println(reverseWord); 
	return reverseWord;
	  }
	public static void rrreverseString (String st) {
		String a [] = st.split(" ");
		String reverseWord="";
	for(String word:a) {
		StringBuffer sb= new StringBuffer(word);	
		sb.reverse();
		reverseWord= reverseWord+ sb.toString() + " ";
	}
	System.out.println(reverseWord);
	  }
public static void main(String [] args) {
	reverseString("i am am from mumbai");
	rreverseString(" i am Gajanan awchar");
	rrreverseString("i am Gajanan awchar i am");
	
}
}