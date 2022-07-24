package exception_Handling;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		int a[] = new int[10];
		//a[11]=50;
		try {a[11]=50;
				
		}
		catch (Exception e){	
	System.out.println("java.lang.ArrayIndexOutOfBoundsException: ");
		}
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("End");
	}

}
