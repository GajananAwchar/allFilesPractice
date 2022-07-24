package opps_Concept_Java;

public class Method_Overloading3 {

	public static void main(String[] args) {
		// Method_Overloading2   by different data type
		Method_Overloading3 concat = new Method_Overloading3();
		concat.Concatenation("I ","am"," Teacher");
		concat.Concatenation(5, 10, 15);
		
	}	
	public void Concatenation(String a, String b, String c) {
		 String d = a+b+c;
		System.out.println("Answer1 is:"+d);
	}	
	public void Concatenation(int a, int b, int c) {
		 int d = a+b+c;
		System.out.println("Answer2 is:"+d);
	}	
		
}
