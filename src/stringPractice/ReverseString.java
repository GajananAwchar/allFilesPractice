package stringPractice;

public class ReverseString {
public static void reverseString1() {
	String a= "SOftware";
	StringBuffer sb = new StringBuffer(a);
	StringBuffer sbc= sb.reverse();
	System.out.println(sbc);
}
public static void reverseString2() {
	String c= "I am Engineer";
	StringBuilder sbd= new StringBuilder(c);
	StringBuilder sbd1= sbd.reverse();
	System.out.println(sbd1);
}
	public static void main(String [] args) {
		reverseString2();
		reverseString1();
		// reverse String
		// first way
		String s= "Love";
		String rev="";
		int len= s.length(); // length = 4   index size 3
		for(int i=len-1;i>=0;i--) {
		rev= rev+ s.charAt(i);
		}
		System.out.println(rev);
	}
}
