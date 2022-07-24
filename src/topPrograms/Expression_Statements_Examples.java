package classDemo;

class Car{
	int carPrice; // instance variable
	public void printcarPrice(int carPrice) {
		System.out.println("The Price of CarCompany is: " +carPrice);
	}
}
public class Expression_Statements_Examples {
/* 
 		Statements are roughly equivalent to sentences in natural languages. 
 		A statement forms a complete unit of execution. 
 		The following types of expressions can be made into a statement by terminating the expression with a semicolon (;).

	Assignment expressions
	Any use of ++ or --
	Method invocations
	Object creation expressions
 								*/
	public static void main(String[] args) {
		int value = 40;  // declaration statement
		int number;// local variable
		number = 10;  // assignment statement
		number++;    // increment statement ... post fix increment operator increase number value by 1. i.e. print as '11'
		System.out.println(number);   // method invocation statement
		Car Indica = new Car();       // object creation Expression statement
		Indica.printcarPrice(4_00_000);
		System.out.println("THe value is :"+value);
		
		
		
		
		
	}

}
