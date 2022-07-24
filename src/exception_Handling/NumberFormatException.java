package exception_Handling;

public class NumberFormatException {

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");

		String p ="abcd";  
		//int i=Integer.parseInt(p);//NumberFormatException  
		try {
			int i=Integer.parseInt(p);	
			System.out.println(i);
		}
		catch (Exception e){	
			e.printStackTrace();
			System.out.println("NumberFormatException.java");
		}
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("End");
	}

}
