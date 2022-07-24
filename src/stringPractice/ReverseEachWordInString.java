package stringPractice;

public class ReverseEachWordInString {
public static void main(String[] args) {
		String str = "WELCOME TO JAVA";
String words[] = str.split(" "); // split into words
 
String reverseString= "";

for(String w:words) { // first itration WELCOME
	String reverseWord= "";
	for(int i=w.length()-1; i>=0;i--) {
		reverseWord = reverseWord +w.charAt(i);		
	}
	reverseString= reverseString+ reverseWord+" ";
}	
System.out.println(reverseString);
}
}
