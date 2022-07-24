package classDemo;

public class DynamiCalculator {
	public static String getMyFullName(String first,String middleName ,String lastname) {
		String fullname=first+ middleName+lastname;
		return fullname;
		
		
	}
	public static int add(int a, int b) {
		int c=a+b;
	return c;

		
	}
	public static double sub(double x,double y) {
		double result=x-y;
		return result;
		
		
	}
	public static void main(String[] args) {
		String rollNo1Name= getMyFullName("Gajanan ", "Manikrao", " Awchar");
		int addition = add(10, 30);
		double sub= sub(50, 20);
		System.out.println(rollNo1Name);
		System.out.println(sub);
		System.out.println(addition);
	}

}
