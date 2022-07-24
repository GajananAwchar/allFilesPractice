package javaTutorials;
public class MethodConcept5 {
	public static void main(String[] args) {
		MethodConcept5 method = new MethodConcept5(); // object creation for non static method
		boolean number =example(50, 100); // calling  public static method. no need of object
		int totalSalary1 = method.add(5000,10000);
		System.out.println("the condition is:  "+number);
		System.out.println("the salary is: "+totalSalary1);
			}
	public static boolean example (int number1,int number2)   // static method . return type is boolean
	{
		if(number1>=number2) {     // if else condition use
		return 	true;
		}
		else {
			return false;
		}
	}
	public  int add (int salary1, int salary2) {   // non static method . return type is int
		int totalSalary = salary1+salary2;
		return totalSalary;
		}
}
