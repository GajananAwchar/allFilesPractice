package practiceJava.Inheritance;

public class StringPractice {
	public static String s= "   Gajan123a#$%^&**(n    ";
	public static void main (String [] args) {
		String a="abdc";
		String b= "Abdc";
	// returns char value at specified index
	String g = a.concat(b);
	System.out.println(g);
	// compare String a with b if a=b output is 0 and if a>b 
int c= 	a.compareTo(b);	
System.out.println(c);
int d= a.compareToIgnoreCase(b);
System.out.println(d);
	String e= a.concat(b);

	System.out.println(e);
	boolean result= a.contains("a, b");
	System.out.println(result);

	}

}
