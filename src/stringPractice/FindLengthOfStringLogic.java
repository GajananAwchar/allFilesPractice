package stringPractice;

public class FindLengthOfStringLogic {
	public static int getLengthOfString(String str) {
		int length=0;
		char [] strcharArray= str.toCharArray();
		for(char c:strcharArray) {
			length ++;
		}
		
		return length;
		
	}
	public static void main(String[] args) {
		String s= "dasdsdasd";
		System.out.println(getLengthOfString(s)); 
	}
}
