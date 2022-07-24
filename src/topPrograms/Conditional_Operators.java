package classDemo;

public class Conditional_Operators 
{	
	/* 
 	Conditional Operators Use
 	&& Conditional-AND
	|| Conditional-OR
 */
	public static void main(String[] args) 
	{
	int number1 = 1;
	int number2 = 1;
	int number3 = 3;
	int number4 = 3;
	if((number1==number2) && (number3==number4)) {
	System.out.println("number1== number2 and number3==number4");
	}
	if((number1==number2) || (number3>number4)) {
		System.out.println("number1== number2 OR number3<number4");
		}
		
	}

}
