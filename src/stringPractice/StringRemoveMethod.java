package stringPractice;

public class StringRemoveMethod {
public static void main(String[] args) {
	String s= "Tomorrow";
	//s= s.replace("Tomo","Spa");
	System.out.println(s);
	//String nS=s.substring(1);// begin with index after
	//String nS=s.substring(1, 3);
	//String nS=(String) s.subSequence(1, 4);
	CharSequence seq= s.subSequence(2, 4);
}
	
}
