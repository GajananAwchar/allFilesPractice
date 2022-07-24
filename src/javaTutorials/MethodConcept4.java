package javaTutorials;
public class MethodConcept4 {
	public static void main(String[] args) {
		MethodConcept4 meth4 = new MethodConcept4();
		int number ;
		boolean result = meth4.example(20, 20);
		number= meth4.addtion(10, 20);
		System.out.println("The addition is:" +number);
		System.out.println("THe result is :" +result);
	}
	public boolean example (int a,int b)   // non static method . return type is boolean
	{
		if(a==b) {     // if else condition use
		return 	true;
		}
		else {
			return false;
		}
	}
	public int addtion (int a, int b) {   // non static method . return type is int
		int c;
		c=a+b;
		return c;
		}
}
