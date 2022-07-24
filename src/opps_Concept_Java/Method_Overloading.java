package opps_Concept_Java;

public class Method_Overloading {
// Method_Overloading having having same data types with different numbers
	public static void main(String[] args) {
		
		Method_Overloading noOfdataTypes = new Method_Overloading();
		noOfdataTypes.mul(5, -3);
		noOfdataTypes.mul(2, 4, 0);
		noOfdataTypes.mul(2, 4, 3, -2);
	}
	public void mul(int a, int b) {  // two data types quantity
		int c =a*b;
		System.out.println("Answer1 of c is:"+c);
		System.out.println();
		
	}
	public void mul(int a, int b, int c) {  // three data types quantity
		int d =a*b*c;
		System.out.println("Answer2 is :"+d);
		System.out.println();
	}
	public void mul(int a, int b, int c, int d) { // four data types quantity
		
		int e= (a*b)+(c*d);
		b++;
		System.out.println("Answer3 is : :"+e);
	}
}
