package javaBascis;
public class VariableConcept2 {
	int rollNumber=100;  //instance variable
	static int id = 10;   // Static variable
	public static void main(String[] args) {
			//VariableConcept2 vc = new VariableConcept2(); // object
		//vc.Demo();  // non static method  demo () calling
		Test();   // static method calling no need to create object because static to static reference
		VariableConcept2.id=500;
		System.out.println(id);
	}
	// this is non static method
	public void Demo() {   
		System.out.println("results for reference from instance areaa to instance area");
		System.out.println(id);   // we can access static variable from instance area to instance area
		System.out.println(rollNumber);   // we can access instance variable from instance area to instance area
	}
	//this is static method
	public static void Test() {
		VariableConcept2 vc1 = new VariableConcept2();
		vc1.rollNumber=200;
		id=20;
		String s= "static method"; // local variable
		System.out.println("results for reference from instance area to static area");
		System.out.println(VariableConcept2.id);	
		System.out.println(vc1.rollNumber);
		System.out.println(id);
		System.out.println(s);	
	}
}
