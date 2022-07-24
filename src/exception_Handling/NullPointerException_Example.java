package exception_Handling;

public class NullPointerException_Example {

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		String s= null;
		//System.out.println(s.length());
		try {
			System.out.println(s.length());
					}
		catch (Exception es){
			System.out.println("new excep");
			System.out.println(" java.lang.NullPointerException");
		}
		
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("End");
	}

}
