package exception_Handling;

public class CheckedExceptions {

	public static void main(String[] args) {
		System.out.println("Started");
		//Unresolved compilation problem: 
		//Unhandled exception type InterruptedException
		//Thread.sleep(5000);
		int i=10;
		// java.lang.ArithmeticException:
		try {System.out.println(i/0);  // unchecked exception 
		}
		catch (Exception e){
			e.printStackTrace();
			e.getLocalizedMessage();
		}
		System.out.println("Stopped");
	}

}
