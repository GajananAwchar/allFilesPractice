package javaBascis;

public class VariableConcept1 {
	int rollNumber=100;  //instance variable
	static int id = 10;   // Static variable
	public static void main(String[] args) {
		String st ="local variable";   // local variable
		VariableConcept1 student = new VariableConcept1();
		System.out.println("the  instance variable rollNumber: "+student.rollNumber);
		System.out.println("the static variable id: "+id);
		System.out.println("This Veriable is : "+st);
		
		
	}

}
