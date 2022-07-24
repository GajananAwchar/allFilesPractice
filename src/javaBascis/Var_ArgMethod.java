package javaBascis;

public class Var_ArgMethod {
	public static void m2(int... x) {
		System.out.println("Number of Arguments:" + x.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m2();
		m2(10);
		m2(10,20);
		m2(10,20,30);
		
		m2(10,20,30,40);
		

	}

}
