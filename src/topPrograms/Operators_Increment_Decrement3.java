package classDemo;

public class Operators_Increment_Decrement3 {

	public static void main(String[] args) {
		// increment '++' and decrement '--' operator can be applied for all primitive data types except boolean data type
		// x local variable
		char ch= 'a'; // the value 
		byte b= 20;
		//case 1
		/*byte c= a+b; /*for any arithematic operator '+,-,*,/' between two variables 'a' and 'b' the result will be 
		always max(int type  , type 1, type 2). here it is like (int, byte, byte) so,  for result we have to use int 
		data type*/
		
	//	result of two data type can be taken as
		 byte a=2;
		 byte d=3;
		 byte c= (byte) (a+d);
		 short z= (short) (a+d);
		 long q= a+d;
		 float w= a+d;
		 double g= 20.123;
		 double t= 25.02125;
		 float l=(float) (g+t);
		 System.out.println(l);
		 System.out.println(w);
		 System.out.println(q);
		 System.out.println(z);
		 System.out.println(c);
		 /*  
		 byte + short = int type
		  short + short = int type
		  byte = long = long 
		  long= double = double
		  float + long = float
		  char = char = int 
		  eg. 'a' + 'b' = 195 like this 
		  System.out.println('a' + 'b');
		  char + double = double 
		   */
		int e= c+b;
		System.out.println(e);
		System.out.println(10/0.0);
		System.out.println(0.0/0);
		
		
		
		
	}
}
