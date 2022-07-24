package stringPractice;

public class ReverseEachWordInStringPracticeStringBuilder {
// by standard function/ method
	public static void main(String[] args) {
		String str ="WelCome to Java";
		String [] words= str.split(" ");
		String reverseWord="";
		for(String w:words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord= reverseWord+ sb.toString()+" ";
		}
		System.out.println(reverseWord);
		
	}
}
