package javaBascis;

public class VariableConcept {
	int a=10;  // this is instance variable
	String s = "Books";   // this is instance variable
	static String st = "Testing";  // this is static variable
	public static void main(String[] args) {
		VariableConcept vc = new VariableConcept();  // object creation for VariableConcept  
		System.out.println("this is instance variable: "+vc.a);       // instance variable 
		System.out.println("this is instance variable : " +vc.s);       // instance variable
		System.out.println("this is static variable:  "+st);    // // static variable . no need of object creation
		vc.a= 100;
		vc.s = "Pen";
		System.out.println("the value of vc.a is: " +vc.a);
		System.out.println("the value of vc.s is: " +vc.s);
		VariableConcept vc1 = new VariableConcept();  // object creation for VariableConcept
		System.out.println("the value of vc1.a is: " +vc1.a);
		System.out.println("the value of vc1.s is: " +vc1.s);
		Demo();
	}
	public static void Demo () {
		int a =50;  
		System.out.println("the static variable st is: "+VariableConcept.st);
		System.out.println("the instance variable st is :"+a);
	}
}
