package classDemo;

public class Concantenation_Operator {

	public static void main(String[] args) {
		String a= "durga";
		String f = "soft";
		int b= 10, c= 20, d= 30; 
		//a= b+c+d; // ce error found int required String  
		//a= a+b+c; // here we can assign string to string type.. hence no error.
		//b= b+c+d; // here we can assign int to int data type
		// '+' sometimes act as arithematic addition operator and sometimes as String Concantenation operator.  
		//here '+' operator act as concantenation if at least one variable is string addition in execution.
		// in below case execution takes place from left to right direction. 
		//System.out.println(a+f); 
		// i.e. in above 'a+b+c+d' result we get output as 'durga102030' because
		//first 'a+b' here a is string and b it hence concantenation takes place and so on
		System.out.println(b+c+d+a);
		//System.out.println(b+c+a+d); // here first b+c= 30 and then 30+"durga"= 30durga & 30durga+30= 30durga30.   
		//System.out.println(b+a+c+d);
		
		System.out.println(a+" and "+f);
		System.out.println(b+a); // here '+' operator act as arithematic addition operator. we get out put as '60'
	//	System.out.println(a);
		
		
	
	}

}
