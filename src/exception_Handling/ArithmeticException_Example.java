package exception_Handling;

import java.io.File;

public class ArithmeticException_Example {
	public void useexp() throws InterruptedException {
		Thread.sleep(10);
		
		File obj= new File("sdd/ddd/p.docx");
		System.out.println("start");
		System.out.println(120/2);
		try{
			System.out.println(120/0);

		}
		catch(Exception e) {
			
			System.out.println("the stack trace is "+ e.getClass());
		}
		System.out.println("end ");

	}
	public static void main(String[] args) throws Exception {
		ArithmeticException_Example obj= new ArithmeticException_Example();
		obj.useexp();
	}

}
