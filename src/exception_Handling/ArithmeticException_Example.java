package exception_Handling;

public class ArithmeticException_Example {

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		//System.out.println(50/0);
		try {
			System.out.println(50/0);	
		}
		catch (Exception e){	
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("End");
	}

}
