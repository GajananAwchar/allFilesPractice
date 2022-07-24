package opps_Concept_Java;

public class Method_Overloading2 {

	public static void main(String[] args) {
		// Method_Overloading2   by different data type
		Method_Overloading2 concat = new Method_Overloading2();
		concat.Concatenation(10.2f, 10.23254, 500);
		concat.Concatenation(5.5, 10.5, "NewNumber");
		concat.Concatenation("I", "am", "Software Tester");
	}
	public void Concatenation(float a, double b, int c) {
		 double d=a+b+c;
		System.out.println("Answer1 is:"+d);
		
	}
	public void Concatenation(double a, double b, String c) {
		 String d = a+b+c;
		System.out.println("Answer2 is:"+d);
	}	
	public void Concatenation(String a, String b, String c) {
		 String d = a+b+c;
		System.out.println("Answer3 is:"+d);
	}	
		
}
