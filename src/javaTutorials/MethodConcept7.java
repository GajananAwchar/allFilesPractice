package javaTutorials;

public class MethodConcept7 {

	public static void main(String[] args) {
		MethodConcept7 totalsal = new MethodConcept7();
		int totalsalary = totalsal.add(5000, 10000);
		System.out.println(totalsalary);
		boolean result1=result(40,50);
		System.out.println(result1);
		totalsal.result3(100, 500);
		System.out.println(totalsal.result3(100, 500));
		
	}
	public  int add (int salary1, int salary2) {   // non static method . return type is int
		int totalSalary = salary1+salary2;
		return totalSalary;
		}
	public static boolean result (int a, int b) {   // non static method . return type is int
		if (a>b) {
			return true;
			}
		else {
			return false;}
		}
		private boolean result3 (int a, int b) {   // non static method . return type is int
			if (a>b) {
				return true;
				}
			else {
				return false;
		
		
		}
	
		}
}
